package library.api.libraryprojectapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBLAUTHOR")
public class Author {
    @Id
    @Column(name = "AUTHORID", length = 10, nullable = false)
    private String authorID;
    @Column(name = "AUTHORNAME", length = 50, nullable = false)
    private String authorName;
    @Column(name = "AUTHORIMAGE", length = 50, nullable = false)
    private String authorImage;
    public Author() {
    }
    public Author(String authorID, String authorName, String authorImg) {
        this.authorID = authorID;
        this.authorName = authorName;
        this.authorImage = authorImg;
    }
    public String getAuthorID() {
        return authorID;
    }
    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorImg() {
        return authorImage;
    }
    public void setAuthorImg(String authorImg) {
        this.authorImage = authorImg;
    }

    
}
