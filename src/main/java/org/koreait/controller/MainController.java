package org.koreait.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class MainController {
	
	@RequestMapping("/PMS")
	public String main(Model model) {
		
		return "main";
	}
	
}
