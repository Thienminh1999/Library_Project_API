package library.api.libraryprojectapi.json;

import java.io.Serializable;

public class BookSubCateID implements Serializable {
    private String bookID;
    private String subCategoryID;
    public BookSubCateID() {
    }
    public BookSubCateID(String bookID, String subCategoryID) {
        this.bookID = bookID;
        this.subCategoryID = subCategoryID;
    }

    
}
