package library.api.libraryprojectapi.controller;

import java.util.List;

import javax.sound.midi.SysexMessage;

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

    private Object obj = null;
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

    //ví dụ QR code: "US-215412", "BO-521458"
    @PostMapping(value="/qrcode")
    public Object qrcode(@RequestBody String qrcode) {
        System.out.println("QRCode: " + qrcode); 
        this.obj = rentService.getQrCodeObj(qrcode);
        return obj;
    }

    @GetMapping(value="/getqrinfo")
    public Object qrcode() {
        return this.obj;
    }
    

    
}
