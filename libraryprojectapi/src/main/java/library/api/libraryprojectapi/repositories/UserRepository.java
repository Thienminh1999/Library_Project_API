package library.api.libraryprojectapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import library.api.libraryprojectapi.entities.User;



public interface UserRepository extends JpaRepository<User, String>  {
    public User findByUserName(String name);

    @Query(value = "select top 10 UserID from tblRent order by RentDate desc", nativeQuery = true)
    public List<String> findUserIDRentRecent();

    @Query(value = "select count(ReviewID) from tblReview", nativeQuery = true)
    public int countReview();

    @Query(value = "select count(UserID) from tblUser where RoleID = N'002'", nativeQuery = true)
    public int countUser();

    @Query(value = "select count(BookID) from tblBook", nativeQuery = true)
    public int countBook();

    @Query(value = "select count(RentID) from tblRent", nativeQuery = true)
    public int countRenting();
}
