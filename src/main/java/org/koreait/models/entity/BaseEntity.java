package org.koreait.models.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass @Getter @Setter
public class BaseEntity {
	
	@CreationTimestamp
	private LocalDateTime regDt;
	@UpdateTimestamp
	private LocalDateTime modDt;
}
