package com.example.demo.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Diary;
import com.example.demo.service.DiaryService;

@Controller
public class DiaryController {
	@Autowired
	DiaryService diaryService;
	
	@GetMapping("/allDiary")
	@ResponseBody
	public List<Diary> getAllMemeber() {
		return diaryService.getAllDiary();
	}
	
	@GetMapping("/insertDiary")
	@ResponseBody
	public boolean insertDiary(Diary diary) {
		return diaryService.insertDiary(diary);
	}
}
