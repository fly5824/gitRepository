package com.naver.s1.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	@GetMapping("member/memberJoin")
	public String setJoin()throws Exception{
		return "member/memebrJoin";
	}
	
	

}
