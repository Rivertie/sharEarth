package com.share.earth.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class ClothDetail extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;
	
	private String color;
	
	private String type;
	
	private String thick;
	
	private String seethrouth;
	
	private String flexibility;
	
	private String season;
	
	private String lining;
	
	private boolean isPadded;
	
	private int status; // damaged, clean..
	
	private int sholderSize;
	
	private int breastSize;
	
	private int totalSize;
	
	private int armSize;
	
	private int armholeSize;
	
	
}
