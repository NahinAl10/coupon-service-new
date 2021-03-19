package com.nal.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by nahin on 3/19/2021
 **/
@Controller
public class CouponController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
