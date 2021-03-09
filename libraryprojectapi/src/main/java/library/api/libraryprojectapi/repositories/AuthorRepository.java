package library.api.libraryprojectapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import library.api.libraryprojectapi.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, String> {
    
}
