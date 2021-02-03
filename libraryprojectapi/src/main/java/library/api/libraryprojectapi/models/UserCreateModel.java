package library.api.libraryprojectapi.models;

import java.sql.Date;

public class UserCreateModel {
    private String userID;
    private Date createDate;
    private String fullName;
    private String phoneNumber;
    private String address;
    private String email;

    public UserCreateModel() {
    }

    public UserCreateModel(String userID, Date createDate, String fullName, String phoneNumber, String address,
            String email) {
        this.userID = userID;
        this.createDate = createDate;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}