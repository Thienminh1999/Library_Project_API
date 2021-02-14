package library.api.libraryprojectapi.json;

import java.io.Serializable;

public class RentDetailID implements Serializable {
    private String rentID;
    private String bookID;

    public RentDetailID() {
    }

    public RentDetailID(String rentID, String bookID) {
        this.rentID = rentID;
        this.bookID = bookID;
    }

    
}
