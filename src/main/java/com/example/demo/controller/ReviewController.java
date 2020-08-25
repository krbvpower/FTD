package com.example.demo.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Review;
import com.example.demo.service.ReviewService;

@Controller
public class ReviewController {
	@Autowired
	ReviewService reviewService;
	
	@GetMapping("/allReview")
	@ResponseBody
	public List<Review> getAllMemeber() {
		return reviewService.getAllReview();
	}
	
	@GetMapping("/insertReview")
	@ResponseBody
	public boolean insertReview(Review review) {
		return reviewService.insertReview(review);
	}
}
