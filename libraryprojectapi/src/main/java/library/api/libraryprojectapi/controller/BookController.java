package library.api.libraryprojectapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import library.api.libraryprojectapi.entities.BookInfo;
import library.api.libraryprojectapi.entities.SubCategory;
import library.api.libraryprojectapi.json.Book;
import library.api.libraryprojectapi.services.templates.IBookService;
import library.api.libraryprojectapi.services.templates.IBookSubCategoryService;
import library.api.libraryprojectapi.services.templates.ISubCategoryService;

@RestController
@RequestMapping("/api/")
public class BookController {
    @Autowired
    private IBookService BookService;

    @Autowired
    private ISubCategoryService SubCategoryService;

    @PostMapping("/createBook")
    public Book newBook(@RequestBody Book newBook) {
       System.out.println("\nBook: " + newBook.getListSubCategory());
    return BookService.createBook(newBook);
  }

  @GetMapping("/books")
    public List<Book> getBooks(@RequestBody Book newBook) {
      List<BookInfo> listBookInfo = BookService.getAllBook();
      List<Book> listBook = new ArrayList<>();
      for (BookInfo bookInfo : listBookInfo) {
        List<SubCategory> listSubCate = BookService.findAllSubCatagoryByIdBook(bookInfo.getBookID());
        listBook.add(new Book(bookInfo, listSubCate));
      }
    return listBook;
  }
}
