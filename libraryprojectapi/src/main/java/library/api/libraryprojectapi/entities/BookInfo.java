package library.api.libraryprojectapi.entities;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBLBOOK")
public class BookInfo {
    @Id
	@Column(name = "BOOKID", length = 10, nullable = false)
    private String bookID;
    @Column(name = "BOOKNAME", length = 50, nullable = false)
    private String bookName;
    @Column(name = "PUBLISHER", length = 50, nullable = false)
    private String publisher;
    @Column(name = "PUBLISHDATE", length = 10, nullable = false)
    private String publishDate;
    @Column(name = "QUANTITY", length = 10, nullable = true)
    private String quantity;
    @Column(name = "DESCRIPTIONS", length = 500, nullable = true)
    private String description;
    @Column(name = "BOOKPOSITION", length = 10, nullable = true)
    private String bookPosition;
    @Column(name = "CREATEDDATE", length = 10, nullable = false)
    private Date createdDate;
    @Column(name = "MODIFIEDDATE", length = 10, nullable = true)
    private Date modifiedDate;
    @Column(name = "CREATEDBY", length = 50, nullable = false)
    private String createdBy;
    @Column(name = "MODIFIEDBY", length = 50, nullable = true)
    private String modifiedBy;
    @Column(name = "BOOKIMG", length = 100, nullable = true)
    private String BookImg;
    @Column(name = "CATEGORYID", length = 10, nullable = true)
    private String CategoryID;

    public BookInfo(String bookID, String bookName, String publisher, String publishDate, String quantity,
            String description, String bookPosition, Date createdDate, Date modifiedDate, String createdBy,
            String modifiedBy, String bookImg, String categoryID) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.quantity = quantity;
        this.description = description;
        this.bookPosition = bookPosition;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.BookImg = bookImg;
        this.CategoryID = categoryID;
    }

    public BookInfo(String bookID, String bookName, String publisher, String publishDate, String quantity,
            String description, String bookPosition, String bookImg, String categoryID) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.quantity = quantity;
        this.description = description;
        this.bookPosition = bookPosition;
        this.BookImg = bookImg;
        this.CategoryID = categoryID;
    }

    

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBookPosition() {
        return bookPosition;
    }

    public void setBookPosition(String bookPosition) {
        this.bookPosition = bookPosition;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public BookInfo() {
    }

    public String getBookImg() {
        return BookImg;
    }

    public void setBookImg(String bookImg) {
        BookImg = bookImg;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String categoryID) {
        CategoryID = categoryID;
    }

    
    
}
