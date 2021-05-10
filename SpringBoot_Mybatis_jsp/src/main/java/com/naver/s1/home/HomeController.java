package com.naver.s1.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ======================================
 * 				jsp project
 *=======================================
 */

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model){
		model.addAttribute("message","jsp project");
		return "index";
	}
}
