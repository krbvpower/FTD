package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DiaryDao;
import com.example.demo.dto.Diary;

@Service
public class DiaryService {
	
	@Autowired
	DiaryDao DiaryDao;
	
	public List<Diary> getAllDiary() {
		List<Diary> Diarys = DiaryDao.getDiaryList();
		return Diarys;
	}
	public boolean insertDiary(Diary d) {
		return DiaryDao.addDiary(d);
	}
	public boolean updateDiary(Diary d) {
		return DiaryDao.updateDiary(d);
	}
	public boolean deleteDiary(Diary d) {
		return DiaryDao.deleteDiary(d);
	}

}
