package library.api.libraryprojectapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import library.api.libraryprojectapi.entities.ReviewInfo;
import library.api.libraryprojectapi.json.Review;
import library.api.libraryprojectapi.services.templates.IReviewService;

@RestController
@RequestMapping("/api/")
public class ReviewController {

    @Autowired
    private IReviewService ReviewService;

    //lấy danh sách những bài review của 1 cuốn sách thông qua bookID
    @GetMapping("/review")
    public List<ReviewInfo> getReview(@RequestBody String bookId) {
      return ReviewService.getReviewsByBookId(bookId);
    }

    //lấy danh sách tất cả các bài review
    @GetMapping("/reviews")
    public List<ReviewInfo> getAllReview() {
      return ReviewService.getAllReview();
    }

    //lấy 1 bài review thông qua reviewID
    @GetMapping("/areview")
    public ReviewInfo getAReview(@RequestBody String reviewID) {
      return ReviewService.getReviewByReviewID(reviewID);
    }

    //thêm bài review mới vào database
    @PostMapping("/review")
    public ReviewInfo addReview(@RequestBody Review newReview){
      return ReviewService.addReview(newReview);
    }

    //xóa bài review thông qua reviewID
    @DeleteMapping("/review")
    public void deleteReview(@RequestBody String reviewID){
      ReviewService.deleteReview(reviewID);
    }

    //update content của 1 bài review
    @PutMapping("/review")
    public ReviewInfo updateReview(@RequestBody Review review){
      return ReviewService.updateReview(review);
    }

    //lấy danh sách top 5 bài review gần nhất
    @GetMapping("/reviewrecent")
    public List<ReviewInfo> getReviewRecent(){
      return ReviewService.getReviewRecent();
    }

    @GetMapping("/morereviewinfo")
    public List<Review> getReviewMoreInfo(){
      return ReviewService.getAllReviewMoreInfo();
    }

  

}
