package com.nal.security.controllers;

import com.nal.security.model.Coupon;
import com.nal.security.repos.CouponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by nahin on 3/19/2021
 **/
@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

    @Autowired
    CouponRepo couponRepo;

    @PostMapping("/coupons")
    public Coupon create(@RequestBody Coupon coupon) {
        return couponRepo.save(coupon);
    }

    @GetMapping("/coupons/{code}")
    public Coupon getCoupon(@PathVariable("code") String code) {
        return couponRepo.findByCode(code);
    }
}
