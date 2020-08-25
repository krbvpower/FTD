package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;

import com.example.demo.dto.Program;

@Repository
public class ProgramDao {
	@Autowired(required=true)
	private SqlSession sqlSession;
	private String ns = "com.example.ProgramMapper.";
	
	public boolean addProgram(Program p) {
		if(p == null) {
			return false;
		}
		try {
			sqlSession.insert(ns + "insertProgram", p);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public List<Program> getProgramList() {
		return sqlSession.selectList(ns + "getTotalProgram");
	}
	
	public boolean deleteProgram(Program p) {
		try {
			sqlSession.delete(ns + "deleteProgramById", p);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean updateProgram(Program p) {
		try {
			sqlSession.update(ns + "updateProgram");
		}catch(Exception e) {
			return false;
		}
		return true;
	}

}
