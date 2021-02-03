package library.api.libraryprojectapi.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "TBLUSER")
public class User {
    @Id
    @Column(name = "USERID", length = 10, nullable = false)
    private String userID;
    @Column(name = "USERNAME", length = 50, nullable = true)
    private String userName;
    @Column(name = "PASSWORD", length = 50, nullable = true)
    private String password;
    @Column(name = "FULLNAME", length = 50, nullable = false)
    private String fullName;
    @Column(name = "PHONENUMBER", length = 11, nullable = true)
    private String phoneNumber;
    @Column(name = "ADDRESS", length = 50, nullable = true)
    private String address;
    @Column(name = "ROLEID", length = 10, nullable = true)
    private String roleID;
    @Column(name = "CREATEDDATE", length = 10, nullable = false)
    private Date createDate;
    @Column(name = "CREATEDBY", length = 50, nullable = true)
    private String createBy;
    @Column(name = "MODIFIEDDATE", length = 10, nullable = true)
    private Date modifiedDate;
    @Column(name = "MODIFIEDBY", length = 50, nullable = true)
    private String modifiedBy;
    @Column(name = "ENABLED", length = 50, nullable = true)
    private String enabled;
    @Column(name = "MAXRENTNUMBER", length = 10, nullable = true)
    private String maxRentNumber;
    @Column(name = "EMAIL", length = 10, nullable = true)
    private String email;

    public User(String userID, String username, String password, String fullName, String phoneNumber, String address,
            String roleID) {
        this.userID = userID;
        this.password = password;
        this.fullName = fullName;
        this.userName = username;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.roleID = roleID;
    }

    public User(String userID, String fullName, String phoneNumber, String address, String roleID, String email,
            Date createDate, String enabled) {
        this.userID = userID;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.roleID = roleID;
        this.email = email;
        this.createDate = createDate;
        this.enabled = enabled;
    }

    public User(String userID, String userName, String password, String fullName, String phoneNumber, String address,
            String roleID, Date createDate, String createBy, Date modifiedDate, String modifiedBy, String enabled,
            String maxRentNumber, String email) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.roleID = roleID;
        this.createDate = createDate;
        this.createBy = createBy;
        this.modifiedDate = modifiedDate;
        this.modifiedBy = modifiedBy;
        this.enabled = enabled;
        this.maxRentNumber = maxRentNumber;
        this.email = email;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public User() {
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getMaxRentNumber() {
        return maxRentNumber;
    }

    public void setMaxRentNumber(String maxRentNumber) {
        this.maxRentNumber = maxRentNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
