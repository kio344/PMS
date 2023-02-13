package org.koreait.models.user;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import org.koreait.models.entity.Member;
import org.koreait.models.user.repository.MemberDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDao {
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	private MemberDataRepository memberRepository;
	
	public void idCheck(String memId) {
		
		Member entity = em.find(Member.class, memId);
		System.out.println(entity.getMemId());
		System.out.println(memId);
		if(entity.getMemId().equals(memId)) {
			throw new RuntimeException();
		}
		
	}

	public void save(MemberDto dto) {
		Member save = memberRepository.save(MemberDto.toEntity(dto));
	}

	public MemberDto get(String id) {
		Member member = memberRepository.findBymemId(id);
		
		if(member == null) {
			throw new RuntimeException();
		}
		
		return MemberDto.toDto(member);
		 
	}

	
}
