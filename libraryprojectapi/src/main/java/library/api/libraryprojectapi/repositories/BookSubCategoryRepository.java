package library.api.libraryprojectapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import library.api.libraryprojectapi.entities.BookSubCategory;

public interface BookSubCategoryRepository extends JpaRepository<BookSubCategory, String> {
    
}
