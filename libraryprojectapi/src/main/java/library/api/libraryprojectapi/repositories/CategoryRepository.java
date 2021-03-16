package library.api.libraryprojectapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import library.api.libraryprojectapi.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, String>  {
    public Category findByCategoryID(String categoryID);
}
