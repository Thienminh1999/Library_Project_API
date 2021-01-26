package library.api.libraryprojectapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import library.api.libraryprojectapi.entities.ReviewInfo;

public interface ReviewRepository extends JpaRepository<ReviewInfo, String>  {
    public List<ReviewInfo> findAllReviewByBookID(String BookID);

    @Query(value = "select top 5 ReviewID, UserID, CreateWhen, ModifiedBy, ModifiedWhen, Content, BookID from tblReview order by CreateWhen desc", nativeQuery = true)
    public List<ReviewInfo> get5ReviewRecent();
}
