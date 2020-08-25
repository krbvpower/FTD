package com.example.demo.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Program;
import com.example.demo.service.ProgramService;

@Controller
public class ProgramController {
	@Autowired
	ProgramService programService;
	
	@GetMapping("/allProgram")
	@ResponseBody
	public List<Program> getAllMemeber() {
		return programService.getAllProgram();
	}
	
	@GetMapping("/insertProgram")
	@ResponseBody
	public boolean insertProgram(Program program) {
		return programService.insertProgram(program);
	}
}
