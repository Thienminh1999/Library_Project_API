package library.api.libraryprojectapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import library.api.libraryprojectapi.entities.SubCategory;

public interface SubCategoryRepository extends JpaRepository<SubCategory, String> {
    @Query(value = "select sc.SubCategoryID, sc.SubCategoryName from tblBookSubCategory bs, tblSubCategory sc where bs.BookID = ?1", nativeQuery = true)
    List<SubCategory> findAllSubCatagoryByIdBook(String id);

    //List<SubCategory> findAllSubCategoryByCategoryID(String CategoryID);
}
