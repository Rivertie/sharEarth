package com.share.earth.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter @Setter @NoArgsConstructor
public class Cloth extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String description;
	
	private int cost;
	
	private String tags;
	
	private String size;
	
	private int sholderSize;
	
	private int breastSize;
	
	private int totalSize;
	
	private int armSize;
	
	private int armholeSize;
	
	private Status status;

	private String sharer;
	
	private String renter;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Brand brand;
	
	@OneToOne
	@JoinColumn(name = "cloth_id")
	private ClothDetail detail;
	
	private Date rentDate;
	
	private Date sharedDate;
	
}
 