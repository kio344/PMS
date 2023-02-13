package org.koreait.controller.user;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.koreait.models.user.JoinRequest;
import org.koreait.models.user.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kimminho
 * 회원가입 및 유효성 검사
 */
@Controller
@RequestMapping("/user")
public class JoinController {
	
	@Autowired
	private JoinService service;
	
	@GetMapping("/join")
	public String join(Model model) {
		JoinRequest request = new JoinRequest();
		
		model.addAttribute("joinRequest", request);
		model.addAttribute("addJs", new String [] {"/join"});
		model.addAttribute("addCss", new String [] {"/join/join"});
		return "/member/join/join";
	}
	
	/**
	 * @author kimminho
	 * 
	 * 유효성 검사 후 오류 출력 또는 DB저장
	 */
	@PostMapping("/join")
	public String data(@Valid JoinRequest request, Errors errors, Model model, HttpServletRequest req) {
		
		model.addAttribute("joinRequest", request);
		model.addAttribute("addJs", new String [] {"/join"});
		model.addAttribute("addCss", new String [] {"/join/join"});
		if(errors.hasErrors()) {
			return "/member/join/join";
		}else {
			service.check(request, req);
			return "redirect:/PMS";
		}
		
	}
	
}
