package library.api.libraryprojectapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import library.api.libraryprojectapi.entities.User;
import library.api.libraryprojectapi.repositories.UserRepository;
import library.api.libraryprojectapi.services.templates.IUserService;



@Repository
public class UserServiceImp implements IUserService {

  @Autowired
  private UserRepository UserRepository;

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
  
}