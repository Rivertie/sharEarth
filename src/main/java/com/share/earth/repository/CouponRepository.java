package com.share.earth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.share.earth.entity.Coupon;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long> {
	
}
