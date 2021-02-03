package library.api.libraryprojectapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import library.api.libraryprojectapi.entities.User;
import library.api.libraryprojectapi.models.DashboardInfo;
import library.api.libraryprojectapi.models.UserCreateModel;
import library.api.libraryprojectapi.services.templates.IUserService;

@RestController
@RequestMapping("/api/")
public class UserController {
    @Autowired
    private IUserService userService;

    //thêm user mới
    @PostMapping("/user")
    public User createUser(@RequestBody UserCreateModel userModel){
        return userService.createUser(userModel);
    }

    //get danh sách tất cả các user
    @GetMapping("/users")
    public List<User> getListUser(){
        return userService.getListUser();
    }

    //số lượng user(không tính admin)
    //số lượng sách
    //số lượng bài review
    //số lượng mượn sách(đã và đang mượn)
    //danh sách 10 user đã và đang mượn sách gần nhất
    @GetMapping("/commoninfo")
    public DashboardInfo getCommonInfo(){
        return userService.getCommonInfo();
    }

    

}
