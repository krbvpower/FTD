package com.example.demo.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	@GetMapping("/")
	public String getHTMLHello() {
		return "hello";
	}
	@GetMapping("/allMember")
	@ResponseBody
	public List<Member> getAllMemeber() {
		return memberService.getAllMember();
	}
	
	@GetMapping("/insertMember")
	@ResponseBody
	public boolean insertMember(Member member) {
		return memberService.insertMember(member);
	}
	
//	@GetMapping("/insertMember")
//	@ResponseBody
//	public boolean insertMember() {
//		Member member = new Member(3,"김시영", "krbvpower@naver.com", "남자", "960123", "01047737214", "2", "krbv7214", "2");
//		return memberService.insertMember(member);
//	}
	
}
