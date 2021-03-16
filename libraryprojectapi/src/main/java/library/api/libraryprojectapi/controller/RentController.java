package library.api.libraryprojectapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import library.api.libraryprojectapi.entities.BookInfo;
import library.api.libraryprojectapi.entities.User;
import library.api.libraryprojectapi.json.RentDetail;
import library.api.libraryprojectapi.json.UserRentBook;
import library.api.libraryprojectapi.services.templates.IRentService;

@RestController
@RequestMapping("/api/")
public class RentController {
    @Autowired
    private IRentService rentService;

    private Object obj = null;
    
    // mượn danh sách sách bởi 1 user

    // @PostMapping(value = "/rent")
    @RequestMapping(value = "/rent" ,method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserRentBook rentBook(@RequestBody UserRentBook rentBook) {
        rentService.rentBooks(rentBook.getUser(), rentBook.getListBook());
        return rentBook;
    }

    // get danh sách lịch sử mượn sách của 1 user
    @GetMapping("/rentinfo")
    public List<RentDetail> getListRentDetailByUserID(@RequestBody String userID) {
        return rentService.getListRentDetailByUserID(userID);
    }

    @PostMapping("/rentinfos")
    public List<RentDetail> getRentDetailByEmail(@RequestBody String email) {
        return rentService.getRentDetailByEmail(email);
    }   

    // ví dụ QR code: "US-215412", "BO-521458"
    @PostMapping(value = "/qrcode")
    public Object qrcode(@RequestBody String qrcode) {
        System.out.println("QRCode: " + qrcode);
        this.obj = rentService.getQrCodeObj(qrcode);
        return obj;
    }

    @GetMapping(value = "/getqruserinfo")
    public User qrusercode() {
        return rentService.getUser();
    }

    @GetMapping(value = "/getqrbookinfo")
    public BookInfo qrbookcode() {
        return rentService.getBookinfo();
    }

    @GetMapping(value = "/qrclearbook")
    public boolean cleanQRBook(){
        return rentService.clearBookInfo();
    }

    @GetMapping(value = "/qrclearuser")
    public boolean cleanQRUser(){
        return rentService.clearUserInfo();
    }


}
