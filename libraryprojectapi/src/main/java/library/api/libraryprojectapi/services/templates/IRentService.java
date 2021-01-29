package library.api.libraryprojectapi.services.templates;

import java.util.List;

import library.api.libraryprojectapi.entities.BookInfo;
import library.api.libraryprojectapi.entities.User;

public interface IRentService {
    public void rentBooks(User user, List<BookInfo> listBookInfo);
}
