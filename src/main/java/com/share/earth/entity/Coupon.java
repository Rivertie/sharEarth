package com.share.earth.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Coupon extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String description;
	
	private float percentage;
	
	
}
