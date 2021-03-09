package library.api.libraryprojectapi.services.templates;

import java.util.List;

import library.api.libraryprojectapi.entities.Author;
import library.api.libraryprojectapi.entities.BookInfo;
import library.api.libraryprojectapi.entities.SubCategory;
import library.api.libraryprojectapi.json.Book;

public interface IBookService {
    public Book createBook(Book newBook);
    public List<BookInfo> getAllBook();
    public List<SubCategory> findAllSubCatagoryByIdBook(String idBook);
    public BookInfo findBookById(String id);
    public BookInfo updateBook(BookInfo bookinfo);
    public void deleteBook(String BookId);
    public Book getBookById(String bookid);
    public List<Book> findBooksByName(String bookName);
    public List<Book> findBookBySubCate(String subCateID);
    public List<BookInfo> get10BookRecently();
    public List<Author> getAuthorByBookID(String id);
}
