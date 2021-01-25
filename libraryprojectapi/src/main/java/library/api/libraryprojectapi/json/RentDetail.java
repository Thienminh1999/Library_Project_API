package library.api.libraryprojectapi.json;

import java.util.List;

public class RentDetail {
    private String rentDetailID;
    private List<Book> listBook;

    public RentDetail(String rentDetailID, List<Book> listBook) {
        this.rentDetailID = rentDetailID;
        this.listBook = listBook;
    }

    public String getRentDetailID() {
        return rentDetailID;
    }

    public void setRentDetailID(String rentDetailID) {
        this.rentDetailID = rentDetailID;
    }

    public List<Book> getListBook() {
        return listBook;
    }

    public void setListBook(List<Book> listBook) {
        this.listBook = listBook;
    }
    
    
}
