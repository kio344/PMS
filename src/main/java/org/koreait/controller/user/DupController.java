package org.koreait.controller.user;

import org.koreait.models.user.MemberDto;
import org.koreait.models.user.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DupController {
	
	@Autowired
	private LoginService service;
	
	@RequestMapping("dup")
	public String test(String memId) {
		/**
		 * 중복체크
		 * 없으면 패스
		 * 있으면 오류
		 */
		try{
			MemberDto dto = service.DupCheck(memId);
			return "중복된 아이디 입니다!";
		}catch (RuntimeException e) {
			return "사용가능한 아이디 입니다!";
		}
		
	}
	
}
