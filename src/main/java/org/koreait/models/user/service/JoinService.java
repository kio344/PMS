package org.koreait.models.user.service;

import org.koreait.models.user.JoinRequest;
import org.koreait.models.user.MemberDto;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

	public void check(JoinRequest request) {
		/**
		 * 유효성 검사
		 * 1. 아이디 체크
		 * 2. 비밀번호 체크( 비밀번호와 비밀번호 확인 검사 후 암호화)
		 * 3. 휴대전화번호 형식 체크
		 * 4. 이메일 체크
		 * 
		 */
		
		MemberDto dto = MemberDto.toDto(request);
		
		
	}
}
