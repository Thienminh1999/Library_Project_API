package library.api.libraryprojectapi.services;

import java.sql.Date;

import java.time.LocalDate;

import java.util.ArrayList;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import library.api.libraryprojectapi.entities.BookInfo;
import library.api.libraryprojectapi.entities.Rent;
import library.api.libraryprojectapi.entities.RentDetailInfo;
import library.api.libraryprojectapi.entities.User;
import library.api.libraryprojectapi.json.Book;
import library.api.libraryprojectapi.json.RentDetail;
import library.api.libraryprojectapi.repositories.BookRepository;
import library.api.libraryprojectapi.repositories.RentDetailRepository;
import library.api.libraryprojectapi.repositories.RentRepository;
import library.api.libraryprojectapi.repositories.UserRepository;
import library.api.libraryprojectapi.services.templates.IRentService;

@Repository
public class RentServiceImp implements IRentService {

    @Autowired
    private RentRepository rentRepository;

    @Autowired
    private RentDetailRepository rentDetaiRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    public void rentBooks(User user, List<BookInfo> listBookInfo) {

        long millis = System.currentTimeMillis();
        Date rentDate = new Date(millis);
        LocalDate returnDate = rentDate.toLocalDate().plusDays(30);

        String uuid = UUID.randomUUID().toString();

        String statusID = "R";

        Rent rent = new Rent(uuid, rentDate, Date.valueOf(returnDate), user.getUserID(), statusID);
        rentRepository.save(rent);

        for (BookInfo bookInfo : listBookInfo) {
            rentDetaiRepository.save(new RentDetailInfo(uuid, bookInfo.getBookID()));
        }

    }

    public List<RentDetail> getListRentDetailByUserID(String userID){
        List<Rent> listRent = rentRepository.findAllByUserID(userID);
        List<RentDetail> listRentDetail = new ArrayList<>();
        for (Rent rent : listRent) {
            RentDetail rentDetail = new RentDetail();
            rentDetail.setRent(rent);
            List<String> listBookID = rentDetaiRepository.findAllBookIDByRentID(rent.getRentID());
            List<BookInfo> listBook = new ArrayList<>();
            for (String bookID : listBookID) {
                BookInfo bookinfo = bookRepository.findById(bookID).get();
                listBook.add(bookinfo);
            }
            rentDetail.setListBook(listBook);
            listRentDetail.add(rentDetail);
        }
        return listRentDetail;
    }

    public Object getQrCodeObj(String qrCode){
        String[] arr = qrCode.split("-");
        if(arr[0].equals("US")){
            User user = userRepository.findById(qrCode).get();
            return user;
        }
        BookInfo bookinfo = bookRepository.findById(qrCode).get();
        return bookinfo;
    }
}
