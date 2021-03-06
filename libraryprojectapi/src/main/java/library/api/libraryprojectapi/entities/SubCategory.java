package library.api.libraryprojectapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name = "TBLSUBCATEGORY")
public class SubCategory {
    @Id
	@Column(name = "SUBCATEGORYID", length = 10, nullable = false)
    private String subCategoryID;
    @Column(name = "SUBCATEGORYNAME", length = 50, nullable = false)
    private String subCategoryName;
   

    public SubCategory(String subCategoryID, String subCategoryName) {
        this.subCategoryID = subCategoryID;
        this.subCategoryName = subCategoryName;
        
    }

    public String getSubCategoryID() {
        return subCategoryID;
    }

    public void setSubCategoryID(String subCategoryID) {
        this.subCategoryID = subCategoryID;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }
    public SubCategory() {
    }

    
}
