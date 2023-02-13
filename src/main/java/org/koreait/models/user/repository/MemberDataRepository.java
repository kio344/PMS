package org.koreait.models.user.repository;

import java.util.List;

import org.koreait.models.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberDataRepository extends JpaRepository<Member, Long>{
	Member findBymemId(String id);
	
}
