package library.api.libraryprojectapi.services;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import library.api.libraryprojectapi.entities.ReviewInfo;
import library.api.libraryprojectapi.entities.User;

import library.api.libraryprojectapi.models.DashboardInfo;
import library.api.libraryprojectapi.models.UserCreateModel;
import library.api.libraryprojectapi.repositories.ReviewRepository;
import library.api.libraryprojectapi.repositories.UserRepository;
import library.api.libraryprojectapi.services.templates.IUserService;



@Repository
public class UserServiceImp implements IUserService {

  @Autowired
  private UserRepository UserRepository;

  @Autowired
  private ReviewRepository ReviewRepository;

  @Override
  public User createOrUpdate(User User) {
    // TODO Auto-generated method stub
    return null;
  }

  public User findByUserName(String name) {
    return UserRepository.findByUserName(name);
  }

  @Override
  public List<User> getListUser() {
    return UserRepository.findAll();
  }

  @Override
  public User checkLogin(String username, String password){
      User user = UserRepository.findByUserName(username);
      if (user == null) {
        return null;
      }
      if (!password.equals(user.getPassword())) {
        return null;
      }
      return user;
  }

  public User createUser(UserCreateModel userModel){
    long millis = System.currentTimeMillis();
    Date createdDate = new Date(millis);
    User user = new User(userModel.getUserID(), userModel.getFullName(), userModel.getPhoneNumber(), userModel.getAddress(), "002", userModel.getEmail(), createdDate, "True");
    return UserRepository.save(user);
  }

  public List<User> getUserRentRecent(){
    List<String> ListUserID = UserRepository.findUserIDRentRecent();
    List<User> listUser = new ArrayList<>();
    for (String userID : ListUserID) {
      User user = UserRepository.findById(userID).get();
      listUser.add(user);
    }
    return listUser;
  }

  public DashboardInfo getCommonInfo(){
    int memberQuantity = UserRepository.countUser();
    int bookQuantity = UserRepository.countBook();
    int reviewQuantity = UserRepository.countReview();
    int rentingQuantity = UserRepository.countRenting();

    List<User> listUser = getUserRentRecent();
    List<ReviewInfo> listReview = ReviewRepository.get5ReviewRecent();
    DashboardInfo infos = new DashboardInfo(memberQuantity, bookQuantity, reviewQuantity, rentingQuantity, listUser, listReview);
    return infos;
  }

  public Boolean checkEmailExist(String email){
    User user = UserRepository.findByEmail(email);
    if(user == null){
      return false;
    }
    return true;
  }

  
  
}