package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;

import com.example.demo.dto.Diary;

@Repository
public class DiaryDao {
	@Autowired(required=true)
	private SqlSession sqlSession;
	private String ns = "com.example.DiaryMapper.";
	
	public boolean addDiary(Diary d) {
		if(d == null) {
			return false;
		}
		try {
			sqlSession.insert(ns + "insertDiary", d);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public List<Diary> getDiaryList() {
		return sqlSession.selectList(ns + "getTotalDiary");
	}
	
	public boolean deleteDiary(Diary d) {
		try {
			sqlSession.delete(ns + "deleteDiaryById", d);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean updateDiary(Diary d) {
		try {
			sqlSession.update(ns + "updateDiary");
		}catch(Exception e) {
			return false;
		}
		return true;
	}

}
