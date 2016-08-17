package com.ecommerce.controller;

import com.ecommerce.model.BillingAddress;
import com.ecommerce.model.Cart;
import com.ecommerce.model.Customer;
import com.ecommerce.model.ShippingAddress;
import com.ecommerce.service.CartService;
import com.ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Alx on 8/17/2016.
 */
@Controller
@RequestMapping("/register")
public class RegisterController {


    @Autowired
    CustomerService customerService;

    @Autowired
    CartService cartService;

    @RequestMapping("/")
    public String doRegister(Model model) {
        Customer customer = new Customer();
        BillingAddress billingAddress = new BillingAddress();
        ShippingAddress shippingAddress = new ShippingAddress();

        customer.setBillingAddress(billingAddress);
        customer.setShippingAddress(shippingAddress);

        model.addAttribute("customer", customer);
        return "register";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String doRegisterPost(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "register";
        }
        List<Customer> customers = customerService.findAllCustomers();
        for (int i = 0; i < customers.size(); i++) {
            if (customer.getUsername().equals(customers.get(i).getUsername())) {
                model.addAttribute("msjUsername", "Username already exist!");
                return "register";
            }
            if (customer.getEmail().equals(customers.get(i).getEmail())) {
                model.addAttribute("msjEmail", "Email already exist!");
                return "register";
            }
        }

        Cart cart = new Cart();
        customer.setCart(cart);
        customerService.saveCustomer(customer);



        return "registerSuccess";
    }
}
