package com.naver.s1.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naver.s1.board.BoardVO;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	@GetMapping("join")
	public String setJoin()throws Exception{
		return "member/memberJoin";
	
	}
	
	@GetMapping("login")
	public String getLogin()throws Exception{
		return "member/memberLogin";
	}
	

}
