package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProgramDao;
import com.example.demo.dto.Program;

@Service
public class ProgramService {
	
	@Autowired
	ProgramDao ProgramDao;
	
	public List<Program> getAllProgram() {
		List<Program> Programs = ProgramDao.getProgramList();
		return Programs;
	}
	public boolean insertProgram(Program p) {
		return ProgramDao.addProgram(p);
	}
	public boolean updateProgram(Program p) {
		return ProgramDao.updateProgram(p);
	}
	public boolean deleteProgram(Program p) {
		return ProgramDao.deleteProgram(p);
	}

}

