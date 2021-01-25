package library.api.libraryprojectapi.services.templates;

import java.util.List;

import library.api.libraryprojectapi.entities.BookInfo;
import library.api.libraryprojectapi.entities.SubCategory;
import library.api.libraryprojectapi.json.Book;

public interface IBookService {
    public Book createBook(Book newBook);
    public List<BookInfo> getAllBook();
    public List<SubCategory> findAllSubCatagoryByIdBook(String idBook);
}
