package library.api.libraryprojectapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import library.api.libraryprojectapi.entities.BookInfo;
import library.api.libraryprojectapi.json.Book;


public interface BookRepository extends JpaRepository<BookInfo, String> {
    // public Book createBook(Book newBook);
}
