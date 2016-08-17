package com.ecommerce.controller;

import com.ecommerce.model.BillingAddress;
import com.ecommerce.model.Customer;
import com.ecommerce.model.Product;
import com.ecommerce.model.ShippingAddress;
import com.ecommerce.service.CustomerService;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.SessionScope;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Alx on 8/9/2016.
 */
@Controller
@SessionScope
public class HomeController {




    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public String home() {
        return "home";
    }



    @RequestMapping("/login")
    public String doLogin(){
        return "login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLoginPost(@RequestAttribute ("username") String username, @RequestAttribute("password") String password, Model model){


       if(customerService.getCustomerByUsername(username, password)==null){
           model.addAttribute("errorLogin", "Invalid username or password");
           return "login";
      };


       return "redirect:/product/productList/all";
    }
}
