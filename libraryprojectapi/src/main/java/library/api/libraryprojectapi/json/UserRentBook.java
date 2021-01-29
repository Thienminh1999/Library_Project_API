package library.api.libraryprojectapi.json;

import java.util.List;

import library.api.libraryprojectapi.entities.BookInfo;
import library.api.libraryprojectapi.entities.User;

public class UserRentBook {
    private User user;
    private List<BookInfo> listBook;

    public UserRentBook() {
    }

    public UserRentBook(User user, List<BookInfo> listBook) {
        this.user = user;
        this.listBook = listBook;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<BookInfo> getListBook() {
        return listBook;
    }

    public void setListBook(List<BookInfo> listBook) {
        this.listBook = listBook;
    }
    
}
