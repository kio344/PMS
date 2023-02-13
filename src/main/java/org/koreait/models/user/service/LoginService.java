package org.koreait.models.user.service;

import javax.servlet.http.HttpServletRequest;

import org.koreait.models.user.MemberDao;
import org.koreait.models.user.MemberDto;
import org.mindrot.bcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	private MemberDao memberDao;
	
	public MemberDto check(HttpServletRequest req) {

		String id = req.getParameter("loginId");
		String pw = req.getParameter("loginPw");
		MemberDto member = memberDao.get(id);
		
		boolean pwMatch = BCrypt.checkpw(pw, member.getMemPw());
		
		if(!pwMatch) {
			throw new RuntimeException();
		}
		return member;
	}
	
	public MemberDto DupCheck(String memId) {
		MemberDto member = memberDao.get(memId);
		
		return member;
	}

}
