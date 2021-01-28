package library.api.libraryprojectapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
