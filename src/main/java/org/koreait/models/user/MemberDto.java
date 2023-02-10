package org.koreait.models.user;

import org.koreait.models.entity.User;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class MemberDto {
	
	private Long memNo;
	private String memId;
	private String memPw;
	private String memPwRe;
	private String memNm;
	private String mobile;
	private String address;
	private String email;
	private String nickName;
	
	public static User toEntity(MemberDto dto) {
		if(dto == null) {
			return null;
		}
		User entity = new User();
		
		entity.setMemId(dto.getMemId());
		entity.setMemPw(dto.getMemPw());
		entity.setMemNm(dto.getMemNm());
		entity.setMemNo(dto.getMemNo());
		entity.setAddress(dto.getAddress());
		entity.setEmail(dto.getEmail());
		entity.setMobile(dto.getMobile());
		entity.setNickName(dto.getNickName());
		
		return entity;
	}
	
	public static MemberDto toDto(User entity) {
		if(entity == null) {
			return null;
		}
		
		MemberDto dto = new MemberDto();
		
		dto.setMemId(entity.getMemId());
		dto.setMemPw(entity.getMemPw());
		dto.setMemNm(entity.getMemNm());
		dto.setMemNo(entity.getMemNo());
		dto.setAddress(entity.getAddress());
		dto.setEmail(entity.getEmail());
		dto.setMobile(entity.getMobile());
		dto.setNickName(entity.getNickName());
		
		return dto;
	}
	
	public static MemberDto toDto(JoinRequest request) {
		if(request == null) {
			return null;
		}
		
		MemberDto dto = new MemberDto();
		
		dto.setMemId(request.getMemId());
		dto.setMemPw(request.getMemPw());
		dto.setMemNm(request.getMemNm());
		dto.setAddress(request.getAddress());
		dto.setEmail(request.getEmail());
		dto.setMobile(request.getMobile());
		dto.setNickName(request.getNickName());
		
		return dto;
	}
	
}
