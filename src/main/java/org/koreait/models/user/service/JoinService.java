package org.koreait.models.user.service;

import javax.servlet.http.HttpServletRequest;

import org.koreait.models.user.JoinRequest;
import org.koreait.models.user.MemberDao;
import org.koreait.models.user.MemberDto;
import org.mindrot.bcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {
	
	@Autowired
	private MemberDao dao;
	
	
	public void check(JoinRequest request, HttpServletRequest req) {
		/**
		 * 유효성 검사
		 * 1. 아이디 체크
		 * 2. 비밀번호 체크( 비밀번호와 비밀번호 확인 검사 후 암호화)
		 * 3. 휴대전화번호 형식 체크
		 */
		
		String memId = request.getMemId();
		try{
			dao.idCheck(memId);
		}catch (RuntimeException e) {
			
		}
		
		String memPw = request.getMemPw();
		String memPwRe = request.getMemPwRe();
		if(!memPw.equals(memPwRe)) {
			throw new RuntimeException();
		}
		String mobile = request.getMobile();
		mobile = mobile.replaceAll("\\D", "");
		// 핸드폰 번호 형식 체크
		boolean isMatch = mobile.matches("01[016]\\d{3,4}\\d{4}");
		if(!isMatch) {
			throw new RuntimeException();
		}
		String hash = BCrypt.hashpw(memPw, BCrypt.gensalt(10));
		MemberDto dto = MemberDto.toDto(request);
		StringBuffer sb = new StringBuffer();
		sb.append(req.getParameter("postcode"));
		sb.append("/");
		sb.append(req.getParameter("addr"));
		sb.append("/");
		sb.append(req.getParameter("extraaddr"));
		sb.append("/");
		sb.append(dto.getAddress());
		dto.setAddress(sb.toString());
		
		dto.setMemPw(hash);
		dto.setMobile(mobile);
		
		dao.save(dto);
	}
}
