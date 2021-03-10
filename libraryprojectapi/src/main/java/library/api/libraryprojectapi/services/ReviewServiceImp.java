package library.api.libraryprojectapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import library.api.libraryprojectapi.entities.BookInfo;
import library.api.libraryprojectapi.entities.ReviewInfo;
import library.api.libraryprojectapi.entities.User;
import library.api.libraryprojectapi.json.Review;
import library.api.libraryprojectapi.repositories.BookRepository;
import library.api.libraryprojectapi.repositories.ReviewRepository;
import library.api.libraryprojectapi.repositories.UserRepository;
import library.api.libraryprojectapi.services.templates.IReviewService;

@Repository
public class ReviewServiceImp implements IReviewService {
    @Autowired
    private ReviewRepository ReviewRepository;

    @Autowired
    private UserRepository UserRepository;

    @Autowired
    private BookRepository BookRepository;

    public List<ReviewInfo> getReviewsByBookId(String bookId) {
        return ReviewRepository.findAllReviewByBookID(bookId);
    }

    public List<ReviewInfo> getAllReview(){
        return ReviewRepository.findAll();
    }

    public List<Review> getAllReviewMoreInfo(){
        List<ReviewInfo> listReviewInfo = ReviewRepository.findAll();
        List<Review> listReview = new ArrayList<>();
        for(int i=0; i<listReviewInfo.size(); i++){
            User user = UserRepository.findById(listReviewInfo.get(i).getUserID()).get();
            BookInfo bookinfo = BookRepository.findById(listReviewInfo.get(i).getBookID()).get();
            Review review = new Review(listReviewInfo.get(i), user.getFullName(), bookinfo.getBookName());
            listReview.add(review);
        }
        return listReview;
    }

    public ReviewInfo addReview(Review review){
        ReviewInfo reviewinfo = new ReviewInfo(review.getReviewID(), review.getUserID(), review.getBookID(), review.getContent(), review.getCreateWhen());
        return ReviewRepository.save(reviewinfo);
    }

    public void deleteReview(String reviewID){
        ReviewRepository.deleteById(reviewID);
    }

    public ReviewInfo updateReview(Review review){
        ReviewInfo reviewinfo = ReviewRepository.getOne(review.getReviewID());
        reviewinfo.setContent(review.getContent());
        return ReviewRepository.save(reviewinfo);
    }

    public ReviewInfo getReviewByReviewID(String reviewID){
        return ReviewRepository.findById(reviewID).get();
    }

    public List<ReviewInfo> getReviewRecent(){
        return ReviewRepository.get5ReviewRecent();
    }
}
