package org.koreait.models.user;

import javax.validation.constraints.NotBlank;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class JoinRequest {
	
	@NotBlank
	@Size(min = 3)
	private String memId;
	@NotBlank
	@Size(min = 4)
	private String memPw;
	@NotBlank
	private String memPwRe;
	@NotBlank
	private String memNm;
	@NotBlank
	private String mobile;
	@NotBlank
	private String address;
	@NotBlank
	@Email
	private String email;
	
}
