package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;

import com.example.demo.dto.Review;

@Repository
public class ReviewDao {
	@Autowired(required=true)
	private SqlSession sqlSession;
	private String ns = "com.example.ReviewMapper.";
	
	public boolean addReview(Review r) {
		if(r == null) {
			return false;
		}
		try {
			sqlSession.insert(ns + "insertReview", r);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public List<Review> getReviewList() {
		return sqlSession.selectList(ns + "getTotalReview");
	}
	
	public boolean deleteReview(Review r) {
		try {
			sqlSession.delete(ns + "deleteReviewById", r);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean updateReview(Review r) {
		try {
			sqlSession.update(ns + "updateReview");
		}catch(Exception e) {
			return false;
		}
		return true;
	}

}
