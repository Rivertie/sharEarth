package com.share.earth.entity;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter @Setter @NoArgsConstructor
public class Person extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String email;
	
	private String address;
	
	private String phone;
}
