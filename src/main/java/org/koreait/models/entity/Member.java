package org.koreait.models.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString
public class Member extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long memNo; // 회원 번호 (고유번호)
	
	@Column(length = 45, nullable = false)
	private String memId; // 회원 아이디
	
	@Column(length = 60, nullable = false)
	private String memPw; // 회원 비밀번호
	
	@Column(length = 40, nullable = false)
	private String memNm; // 회원 이름
	
	@Column(length = 30, nullable = false)
	private String nickName; // 회원 닉네임
	
	@Column(length = 11, nullable = false)
	private String mobile; // 회원 전화번호
	
	@Column(length = 100, nullable = false)
	private String address; // 회원 주소
	
	@Column(length = 60, nullable = false)
	private String email; // 회원 이메일
	
	
}
