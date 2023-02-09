package org.koreait.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class JoinController {
	
	@GetMapping("/join")
	public String join() {
		
		return "/member/join/join";
	}
	
	@PostMapping("")
	public String data() {
		
		
		
		return "";
	}
	
}
