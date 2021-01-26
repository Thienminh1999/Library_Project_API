package library.api.libraryprojectapi.services.templates;

import java.util.List;

import library.api.libraryprojectapi.entities.ReviewInfo;
import library.api.libraryprojectapi.json.Review;

public interface IReviewService {
    public List<ReviewInfo> getReviewsByBookId(String bookId);
    public List<ReviewInfo> getAllReview();
    public ReviewInfo addReview(Review review);
    public void deleteReview(String reviewID);
    public ReviewInfo updateReview(Review review);
    public ReviewInfo getReviewByReviewID(String reviewID);
    public List<ReviewInfo> getReviewRecent();
}
