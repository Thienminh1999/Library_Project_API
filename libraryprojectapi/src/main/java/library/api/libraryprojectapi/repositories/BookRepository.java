package library.api.libraryprojectapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import library.api.libraryprojectapi.entities.BookInfo;



public interface BookRepository extends JpaRepository<BookInfo, String> {
   //@Query(value = "select * from tblBook where BookName like %?1%")
    public List<BookInfo> findAllBookByBookNameLike(String bookName);

    @Query(value = "select b.BookID, b.CreatedDate, b.CreatedBy, b.ModifiedDate, b.ModifiedBy, b.BookName, b.Publisher, b.PublishDate, b.Quantity, b.Descriptions, b.BookPosition, b.BookImg, b.CategoryID, b.Enable, b.AuthorID from tblBook b, tblBookSubCategory bsc where bsc.SubCategoryID = ?1", nativeQuery = true)
    public List<BookInfo> findBookBySubCategoryID(String subCateID); 

    @Query(value = "select b.BookID, b.CreatedDate, b.CreatedBy, b.ModifiedDate, b.ModifiedBy, b.BookName, b.Publisher, b.PublishDate, b.Quantity, b.Descriptions, b.BookPosition, b.BookImg, b.CategoryID, b.Enable, b.AuthorID from tblBook b order by b.CreatedDate desc", nativeQuery = true)
    public List<BookInfo> findTop10BookRecent();
}
