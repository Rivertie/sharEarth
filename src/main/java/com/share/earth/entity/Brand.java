package com.share.earth.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Brand extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	
}
