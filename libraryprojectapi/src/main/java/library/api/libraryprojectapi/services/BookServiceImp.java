package library.api.libraryprojectapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
            BookSubCategoryRepository.save(new BookSubCategory(bookId, subCategory.getCategoryID()));
        }
        return newBook;
    }

    public List<BookInfo> getAllBook(){
       return BookRepository.findAll();
    }

    public List<SubCategory> findAllSubCatagoryByIdBook(String idBook){
        return SubCategoryRepository.findAllSubCatagoryByIdBook(idBook);
    }
}
