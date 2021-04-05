package library.api.libraryprojectapi.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import library.api.libraryprojectapi.json.Account;
import library.api.libraryprojectapi.Utils.CommonUtil;
import library.api.libraryprojectapi.entities.User;
import library.api.libraryprojectapi.services.templates.IUserService;


@RestController
@RequestMapping("/api/")
public class LoginController {

    @Autowired
    private IUserService userService;

    @Autowired
    private JavaMailSender javaMailSender;

    // login sử dụng username và password trong database
    @PostMapping(value = "/checkLogin")
    public Boolean checkLogin(@RequestBody Account account, HttpServletResponse response) {

        User result = userService.checkLogin(account.getUsername(), account.getPassword());
        if (result == null) {
            System.out.println("\nLogin fail\n");
            return false;
        }
        System.out.println("\nLogin successfull\n");
        return true;
    }

    // login sử dụng email để gửi password cho user
    @PostMapping(value = "/login")
    public String getPwLogin(@RequestBody String email) {
        System.out.println("email: " + email);
        String passwordNumber = CommonUtil.getRandomPassoword();
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(email);
        msg.setSubject("Password Login Library Application");
        msg.setText("Your password: " + passwordNumber);
        javaMailSender.send(msg);
        return passwordNumber;
    }

    @PostMapping(value = "/checkemail")
    public boolean checkEmail(@RequestBody String email) {
        boolean existed = userService.checkEmailExist(email);
        return existed;
    }

}
