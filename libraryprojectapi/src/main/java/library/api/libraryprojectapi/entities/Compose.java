package library.api.libraryprojectapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBLCOMPOSE")
public class Compose {
    @Id
    @Column(name = "AUTHORID", length = 10, nullable = false)
    private String authorID;
    @Column(name = "BOOKID", length = 10, nullable = false)
    private String bookID;
    
    public Compose() {
    }

    public Compose(String authorID, String bookID) {
        this.authorID = authorID;
        this.bookID = bookID;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

 
    

}
