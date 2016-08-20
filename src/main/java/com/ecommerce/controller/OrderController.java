package com.ecommerce.controller;

import com.ecommerce.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by Alx on 8/20/2016.
 */

@Controller
@RequestMapping("/customer/order")
@SessionAttributes ("customer")
public class OrderController {


    @RequestMapping
    public String getClientInfo(@ModelAttribute(name = "customer") Customer customer, Model model){
     // model.addAttribute("customers",customer);
        System.out.println(customer.getEmail());
        return "testSessionAttributes";


    }
}
