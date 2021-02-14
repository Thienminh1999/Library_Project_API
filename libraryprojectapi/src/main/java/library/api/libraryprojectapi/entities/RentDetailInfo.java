package library.api.libraryprojectapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import library.api.libraryprojectapi.json.RentDetailID;

@Entity
@Table(name = "TBLRENTDETAIL")
@IdClass(RentDetailID.class)
public class RentDetailInfo {
    @Id
	@Column(name = "RENTID", length = 10, nullable = false)
    private String rentID;
    @Id
	@Column(name = "BOOKID", length = 10, nullable = false)
    private String bookID;

    public RentDetailInfo(String rentID, String bookID) {
        this.rentID = rentID;
        this.bookID = bookID;
    }

    public String getRentID() {
        return rentID;
    }

    public void setRentID(String rentID) {
        this.rentID = rentID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public RentDetailInfo() {
    }
    
    
}
