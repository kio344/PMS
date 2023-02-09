package org.koreait.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class MainController {
	
	@RequestMapping("/PMS")
	public String main(Model model) {
		model.addAttribute("addCss", new String[] {"/common/commons"});
		model.addAttribute("addJs", new String[] {"/menu"});
		
		return "/layout/main/index";
	}
	
}
