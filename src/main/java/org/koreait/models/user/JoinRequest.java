package org.koreait.models.user;


import javax.validation.constraints.Email;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class JoinRequest {
	
	@NotBlank(message = "아이디가 비어있습니다.")
	private String memId;
	
	@NotBlank(message = "비밀번호가 비어있습니다.")
	private String memPw;
	
	@NotBlank(message = "비밀번호를 확인해주세요.")
	private String memPwRe;
	
	@NotBlank(message = "이름을 입력해주세요.")
	private String memNm;
	
	@NotBlank(message = "닉네임을 입력해주세요.")
	private String nickName;
	
	@NotBlank(message = "전화번호를 입력해주세요.")
	private String mobile;
	
	@NotBlank(message = "주소를 입력해주세요.")
	private String address;
	
	@NotBlank(message = "이메일을 입력해주세요.")
	@Email
	private String email;
	
}
