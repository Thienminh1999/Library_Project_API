package library.api.libraryprojectapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import library.api.libraryprojectapi.json.RentDetail;
import library.api.libraryprojectapi.json.UserRentBook;
import library.api.libraryprojectapi.services.templates.IRentService;

@RestController
@RequestMapping("/api/")
public class RentController {
    @Autowired
    private IRentService rentService;

    //mượn danh sách sách bởi 1 user 
    @PostMapping("/rent")
    public void rentBook(@RequestBody UserRentBook rentBook){
        rentService.rentBooks(rentBook.getUser(), rentBook.getListBook());
    }

    //get danh sách lịch sử mượn sách của 1 user
    @GetMapping("/rentinfo")
    public List<RentDetail> getListRentDetailByUserID(@RequestBody String userID){
        return rentService.getListRentDetailByUserID(userID);
    }

    
}
