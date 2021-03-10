package library.api.libraryprojectapi.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBLREVIEW")
public class ReviewInfo {
    @Id
	@Column(name = "REVIEWID", length = 10, nullable = false)
    private String reviewID;
    @Column(name = "USERID", length = 10, nullable = false)
    private String userID;
    @Column(name = "BOOKID", length = 10, nullable = false)
    private String bookID;
    @Column(name = "CONTENT", length = 10, nullable = false)
    private String content;
    @Column(name = "CREATEWHEN", length = 10, nullable = false)
    private Date CreateWhen;

    public ReviewInfo(String reviewID, String userID, String bookID, String content, Date createWhen) {
        this.reviewID = reviewID;
        this.userID = userID;
        this.bookID = bookID;
        this.content = content;
        this.CreateWhen = createWhen;
    }

    public String getReviewID() {
        return reviewID;
    }

    public void setReviewID(String reviewID) {
        this.reviewID = reviewID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ReviewInfo() {
    }

    public Date getCreateWhen() {
        return CreateWhen;
    }

    public void setCreateWhen(Date createWhen) {
        CreateWhen = createWhen;
    }

    
}
