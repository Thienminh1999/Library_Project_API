package library.api.libraryprojectapi.services.templates;

import java.util.List;

import library.api.libraryprojectapi.entities.User;



public interface IUserService {
    User createOrUpdate(User user);

    public User findByUserName(String name);

    public List<User> getListUser();

    public User checkLogin(String username, String password);
}
