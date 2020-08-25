package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberDao;
import com.example.demo.dto.Member;

@Service
public class MemberService {
	
	@Autowired
	MemberDao memberDao;
	
	public List<Member> getAllMember() {
		List<Member> members = memberDao.getMemberList();
		return members;
	}
	public boolean insertMember(Member m) {
		return memberDao.addMember(m);
	}
	public boolean updateMember(Member m) {
		return memberDao.updateMember(m);
	}
	public boolean deleteMember(Member m) {
		return memberDao.deleteMember(m);
	}

}
