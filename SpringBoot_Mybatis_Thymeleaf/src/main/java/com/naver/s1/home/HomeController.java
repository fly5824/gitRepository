package com.naver.s1.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naver.s1.board.BoardVO;

/**
 * ======================================
 * 				thymeleaf project
 *=======================================
 */

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model){
		/* model.addAttribute("message","thymeleaf project"); */
		BoardVO boardVO = new BoardVO();
		boardVO.setNum(1L);
		boardVO.setTitle("title");
		boardVO.setWriter("sk");
		
		System.out.println(boardVO.toString());
		return "index";
	}
}
