package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ReviewDao;
import com.example.demo.dto.Review;

@Service
public class ReviewService {
	
	@Autowired
	ReviewDao ReviewDao;
	
	public List<Review> getAllReview() {
		List<Review> Reviews = ReviewDao.getReviewList();
		return Reviews;
	}
	public boolean insertReview(Review r) {
		return ReviewDao.addReview(r);
	}
	public boolean updateReview(Review r) {
		return ReviewDao.updateReview(r);
	}
	public boolean deleteReview(Review r) {
		return ReviewDao.deleteReview(r);
	}

}
