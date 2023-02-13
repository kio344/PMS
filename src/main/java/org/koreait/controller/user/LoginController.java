package org.koreait.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.koreait.models.user.MemberDto;
import org.koreait.models.user.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public String login() {
		
		
		return "/member/login/login";
	}
	
	@PostMapping("/login")
	public String login(HttpServletRequest req, HttpSession session, Model model) {
		
		try{
			MemberDto member = loginService.check(req);
			session.setAttribute("member", member);
			return "redirect:/PMS";
		}catch (RuntimeException e) {
			return "member/login/login";
		}
		
	}
	
}
