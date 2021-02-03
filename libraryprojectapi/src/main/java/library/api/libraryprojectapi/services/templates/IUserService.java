package library.api.libraryprojectapi.services.templates;

import java.util.List;

import library.api.libraryprojectapi.entities.User;
import library.api.libraryprojectapi.models.DashboardInfo;
import library.api.libraryprojectapi.models.UserCreateModel;



public interface IUserService {
    User createOrUpdate(User user);
    public User findByUserName(String name);
    public List<User> getListUser();
    public User checkLogin(String username, String password);
    public User createUser(UserCreateModel userModel);
    public List<User> getUserRentRecent();
    public DashboardInfo getCommonInfo();
}
