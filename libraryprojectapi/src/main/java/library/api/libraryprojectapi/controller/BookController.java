package library.api.libraryprojectapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import library.api.libraryprojectapi.entities.BookInfo;
import library.api.libraryprojectapi.entities.SubCategory;
import library.api.libraryprojectapi.json.Book;
import library.api.libraryprojectapi.models.BookUpdateModel;
import library.api.libraryprojectapi.services.templates.IBookService;

import library.api.libraryprojectapi.services.templates.ISubCategoryService;

@RestController
@RequestMapping("/api/")
public class BookController {
  @Autowired
  private IBookService BookService;

  @Autowired
  private ISubCategoryService SubCategoryService;

  //thêm 1 cuốn sách mới vào database
  @PostMapping("/createBook")
  public Book newBook(@RequestBody Book newBook) {
    return BookService.createBook(newBook);
  }

  //lấy danh sách tất cả các cuốn sách
  @GetMapping("/books")
  public List<Book> getBooks() {
    List<BookInfo> listBookInfo = BookService.getAllBook();
    List<Book> listBook = new ArrayList<>();
    System.out.println("hello \n");
    for (BookInfo bookInfo : listBookInfo) {
      List<SubCategory> listSubCate = BookService.findAllSubCatagoryByIdBook(bookInfo.getBookID());
      listBook.add(new Book(bookInfo, listSubCate));
    }
    return listBook;
  }

  //update 1 cuốn sách 
  @PutMapping("/book")
  public BookInfo updateBook(@RequestBody BookUpdateModel bookUpdate) {
      BookInfo bookInfo = BookService.findBookById(bookUpdate.getBookId());
      bookInfo.setBookName(bookUpdate.getBookName());
      bookInfo.setBookPosition(bookUpdate.getBookPosition());
      bookInfo.setDescription(bookUpdate.getDescription());
      bookInfo.setQuantity(bookUpdate.getQuantity());
      return BookService.updateBook(bookInfo);
  }

  //xóa 1 cuốn sách thông qua bookID
  @DeleteMapping("/book")
  public void deleteBook(@RequestBody String bookId) {
    BookService.deleteBook(bookId);
    //chưa hoàn thành, phải xóa ở các table khác nữa
  }

  //lấy 1 cuốn sách thông qua BookID
  @GetMapping("/book/{id}")
  public Book getBookById(@PathVariable("id") String bookID) {
    return BookService.getBookById(bookID);
  }

  //tìm kiếm những cuốn sách theo tên 
  @GetMapping("/book")
  public List<Book> getBookByName(@RequestBody String bookName) {
    return BookService.findBooksByName(bookName);
  }

  @GetMapping("/bookBySubCate")
  public List<Book> getBookBySubCate(@RequestBody String subCateID){
    return BookService.findBookBySubCate(subCateID);
  }

  @GetMapping("/bookrencent")
  public List<BookInfo> getTop10BookRecent(){
    return BookService.get10BookRecently();
  }


}
