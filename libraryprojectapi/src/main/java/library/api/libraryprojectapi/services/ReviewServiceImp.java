package library.api.libraryprojectapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import library.api.libraryprojectapi.entities.ReviewInfo;
import library.api.libraryprojectapi.json.Review;
import library.api.libraryprojectapi.repositories.ReviewRepository;
import library.api.libraryprojectapi.services.templates.IReviewService;

@Repository
public class ReviewServiceImp implements IReviewService {
    @Autowired
    private ReviewRepository ReviewRepository;

    public List<ReviewInfo> getReviewsByBookId(String bookId) {
        return ReviewRepository.findAllReviewByBookID(bookId);
    }

    public List<ReviewInfo> getAllReview(){
        return ReviewRepository.findAll();
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
