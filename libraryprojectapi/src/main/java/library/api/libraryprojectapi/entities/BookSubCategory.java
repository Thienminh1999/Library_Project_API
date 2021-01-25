package library.api.libraryprojectapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "TBLBOOKSUBCATEGORY")
public class BookSubCategory {
    @Id
	@Column(name = "BOOKID", length = 10, nullable = false)
    private String bookID;
   
	@Column(name = "SUBCATEGORYID", length = 10, nullable = false)
    private String subCategoryID;

    public BookSubCategory(String bookID, String subCategoryID) {
        this.bookID = bookID;
        this.subCategoryID = subCategoryID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getSubCategoryID() {
        return subCategoryID;
    }

    public void setSubCategoryID(String subCategoryID) {
        this.subCategoryID = subCategoryID;
    }

    
}
