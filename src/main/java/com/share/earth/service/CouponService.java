package com.share.earth.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.share.earth.entity.Coupon;
import com.share.earth.repository.CouponRepository;

@Service
@Transactional
public class CouponService {
	
	private CouponRepository couponRepository;

	public CouponService(CouponRepository couponRepository) {
		this.couponRepository = couponRepository;
	}
	
	
	public Coupon create(Coupon coupon) {
		return couponRepository.save(coupon);
	}
	
	public void delete(Coupon coupon) {
		couponRepository.delete(coupon);
	}
}
