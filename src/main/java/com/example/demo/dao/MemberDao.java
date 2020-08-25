package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;

import com.example.demo.dto.Member;

@Repository
public class MemberDao {
	@Autowired(required=true)
	private SqlSession sqlSession;
	private String ns = "com.example.MemberMapper.";
	
	public boolean addMember(Member m) {
		if(m == null) {
			return false;
		}
		try {
			sqlSession.insert(ns + "insertMember", m);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public List<Member> getMemberList() {
		return sqlSession.selectList(ns + "getTotalMember");
	}
	
	public boolean deleteMember(Member m) {
		try {
			sqlSession.delete(ns + "deleteMemberById", m);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean updateMember(Member m) {
		try {
			sqlSession.update(ns + "updateMember");
		}catch(Exception e) {
			return false;
		}
		return true;
	}

}
