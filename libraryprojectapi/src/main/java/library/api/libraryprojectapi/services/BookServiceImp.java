package library.api.libraryprojectapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import library.api.libraryprojectapi.entities.BookInfo;
import library.api.libraryprojectapi.entities.BookSubCategory;
import library.api.libraryprojectapi.entities.SubCategory;
import library.api.libraryprojectapi.json.Book;
import library.api.libraryprojectapi.repositories.BookRepository;
import library.api.libraryprojectapi.repositories.BookSubCategoryRepository;
import library.api.libraryprojectapi.repositories.SubCategoryRepository;
import library.api.libraryprojectapi.services.templates.IBookService;

@Repository
public class BookServiceImp implements IBookService {
    @Autowired
    private BookRepository BookRepository;

    @Autowired
    private BookSubCategoryRepository BookSubCategoryRepository;

    @Autowired
    private SubCategoryRepository SubCategoryRepository;

    public Book createBook(Book newBook) {
        BookRepository.save(newBook.getBook());
        List<SubCategory> listSub = newBook.getListSubCategory();
        String bookId = newBook.getBook().getBookID();
        for (SubCategory subCategory : listSub) {
            BookSubCategoryRepository.save(new BookSubCategory(bookId, subCategory.getSubCategoryID()));
        }
        return newBook;
    }

    public List<BookInfo> getAllBook() {
        return BookRepository.findAll();
    }

    public List<SubCategory> findAllSubCatagoryByIdBook(String idBook) {
        return SubCategoryRepository.findAllSubCatagoryByIdBook(idBook);
    }

    public BookInfo findBookById(String id) {
        return BookRepository.getOne(id);
    }

    public BookInfo updateBook(BookInfo bookinfo) {
        return BookRepository.save(bookinfo);
    }

    @Transactional
    public void deleteBook(String bookid) {
        BookInfo bookinfo = BookRepository.getOne(bookid);
        BookSubCategoryRepository.deleteByBookID(bookid);
        BookRepository.delete(bookinfo);
    }

    public Book getBookById(String bookid) {
        BookInfo bookinfo = BookRepository.findById(bookid).get();
        Book book = new Book(bookinfo, findAllSubCatagoryByIdBook(bookid));
        return book;
    }

    public List<Book> findBooksByName(String bookName) {
        List<BookInfo> listBookIn = BookRepository.findAllBookByBookNameLike("%" + bookName + "%");
        List<Book> listBook = new ArrayList<>();
        for (BookInfo bookinfo : listBookIn) {
            listBook.add(new Book(bookinfo, findAllSubCatagoryByIdBook(bookinfo.getBookID())));
        }
        return listBook;
    }

    public List<Book> findBookBySubCate(String subCateID){
        List<BookInfo> listBookInfo = BookRepository.findBookBySubCategoryID(subCateID);
        List<Book> listBook = new ArrayList<>();
        for (BookInfo bookinfo : listBookInfo) {
            listBook.add(new Book(bookinfo, findAllSubCatagoryByIdBook(bookinfo.getBookID())));
        }
        return listBook;
    }

    public List<BookInfo> get10BookRecently(){
        List<BookInfo> listBook = BookRepository.findTop10BookRecent();
        return listBook;
    }
}
