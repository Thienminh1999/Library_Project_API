package library.api.libraryprojectapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import library.api.libraryprojectapi.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, String>  {
   //@Query(value = "select c.CategoryID, c.CategoryName from tblCategory c where c.CategoryID = ?1 ", nativeQuery = true)
    public Category findByCategoryID(String categoryID);
}
