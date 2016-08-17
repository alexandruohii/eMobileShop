package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alx on 8/17/2016.
 */

@Controller
@RequestMapping("/cart")
public class CartController {


    @RequestMapping("/add/{productId}")
    public String addCart() {

        return "cart";
    }

}
