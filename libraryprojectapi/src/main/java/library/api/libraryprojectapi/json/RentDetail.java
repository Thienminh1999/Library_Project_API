package library.api.libraryprojectapi.json;

import java.util.List;

import library.api.libraryprojectapi.entities.BookInfo;
import library.api.libraryprojectapi.entities.Rent;

public class RentDetail {
    private Rent rent;
    private List<BookInfo> listBook;

    public RentDetail() {
    }

    public RentDetail(Rent rent, List<BookInfo> listBook) {
        this.rent = rent;
        this.listBook = listBook;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public List<BookInfo> getListBook() {
        return listBook;
    }

    public void setListBook(List<BookInfo> listBook) {
        this.listBook = listBook;
    }

    
    
    
}
