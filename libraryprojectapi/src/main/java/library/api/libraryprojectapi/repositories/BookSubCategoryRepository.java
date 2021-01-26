package library.api.libraryprojectapi.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import library.api.libraryprojectapi.entities.BookSubCategory;

public interface BookSubCategoryRepository extends JpaRepository<BookSubCategory, String> {
    
    @Modifying
    @Query(value = "DELETE FROM tblBookSubCategory WHERE BookID = ?1", nativeQuery = true)
    void deleteByBookID(String id);

    
}
