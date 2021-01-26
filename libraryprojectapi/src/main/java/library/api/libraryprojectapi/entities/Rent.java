package library.api.libraryprojectapi.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBLRENT")
public class Rent {
    @Id
    @Column(name = "RENTID", length = 10, nullable = false)
    private String rentID;
    @Column(name = "RENTDATE", length = 10, nullable = false)
    private Date rentDate;
    @Column(name = "RETURNDATE", length = 10, nullable = false)
    private Date returnDate;
    @Column(name = "USERID", length = 10, nullable = false)
    private String userID;
    @Column(name = "STATUSID", length = 10, nullable = false)
    private String StatusID;

    public Rent(String rentID, Date rentDate, Date returnDate, String userID, String statusID) {
        this.rentID = rentID;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.userID = userID;
        StatusID = statusID;
    }

    public String getRentID() {
        return rentID;
    }

    public void setRentID(String rentID) {
        this.rentID = rentID;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getStatusID() {
        return StatusID;
    }

    public void setStatusID(String statusID) {
        StatusID = statusID;
    }

    

    
}
