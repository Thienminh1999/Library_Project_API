package library.api.libraryprojectapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import library.api.libraryprojectapi.entities.User;



public interface UserRepository extends JpaRepository<User, String>  {
    public User findByUserName(String name);
}
