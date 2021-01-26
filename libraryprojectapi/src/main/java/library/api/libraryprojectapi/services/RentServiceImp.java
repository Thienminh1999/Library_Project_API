package library.api.libraryprojectapi.services;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import library.api.libraryprojectapi.entities.BookInfo;
import library.api.libraryprojectapi.entities.Rent;
import library.api.libraryprojectapi.entities.RentDetailInfo;
import library.api.libraryprojectapi.entities.User;
import library.api.libraryprojectapi.repositories.RentDetailRepository;
import library.api.libraryprojectapi.repositories.RentRepository;
import library.api.libraryprojectapi.services.templates.IRentService;

@Repository
public class RentServiceImp implements IRentService {

    @Autowired
    private RentRepository rentRepository;

    @Autowired
    private RentDetailRepository rentDetaiRepository;

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
}
