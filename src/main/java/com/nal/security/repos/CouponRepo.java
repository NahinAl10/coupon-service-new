package com.nal.security.repos;

import com.nal.security.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nahin on 3/19/2021
 **/
public interface CouponRepo extends JpaRepository<Coupon, Long> {

    Coupon findByCode(String code);
}
