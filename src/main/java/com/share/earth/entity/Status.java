package com.share.earth.entity;

public enum Status {
	
	SHARED, // 대여 대기중
	RENTED, // 대여됨
	RETURNING, // 회수중
	CHECHKING, // 검수중
	CLEANING; // 세탁중
}
