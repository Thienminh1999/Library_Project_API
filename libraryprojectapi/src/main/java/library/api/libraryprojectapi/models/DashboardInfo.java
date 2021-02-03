package library.api.libraryprojectapi.models;

import java.util.List;

import library.api.libraryprojectapi.entities.User;

public class DashboardInfo {
    private int memberQuantity;
    private int bookQuantity;
    private int reviewQuantity;
    private int rentingQuantity;

    private List<User> listUserRecent;

    public DashboardInfo() {
    }

    public DashboardInfo(int memberQuantity, int bookQuantity, int reviewQuantity, int rentingQuantity,
            List<User> listUserRecent) {
        this.memberQuantity = memberQuantity;
        this.bookQuantity = bookQuantity;
        this.reviewQuantity = reviewQuantity;
        this.rentingQuantity = rentingQuantity;
        this.listUserRecent = listUserRecent;
    }

    public int getMemberQuantity() {
        return memberQuantity;
    }

    public void setMemberQuantity(int memberQuantity) {
        this.memberQuantity = memberQuantity;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public int getReviewQuantity() {
        return reviewQuantity;
    }

    public void setReviewQuantity(int reviewQuantity) {
        this.reviewQuantity = reviewQuantity;
    }

    public int getRentingQuantity() {
        return rentingQuantity;
    }

    public void setRentingQuantity(int rentingQuantity) {
        this.rentingQuantity = rentingQuantity;
    }

    public List<User> getListUserRecent() {
        return listUserRecent;
    }

    public void setListUserRecent(List<User> listUserRecent) {
        this.listUserRecent = listUserRecent;
    }

    
}
