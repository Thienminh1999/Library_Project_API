package library.api.libraryprojectapi.services.templates;

import java.util.List;

import library.api.libraryprojectapi.entities.BookInfo;

import library.api.libraryprojectapi.entities.User;
import library.api.libraryprojectapi.json.RentDetail;

public interface IRentService {
    public void rentBooks(User user, List<BookInfo> listBookInfo);
    public List<RentDetail> getListRentDetailByUserID(String userID);
    public Object getQrCodeObj(String qrCode);
    public User getUser();
    public BookInfo getBookinfo();
    public Boolean clearBookInfo();
}
