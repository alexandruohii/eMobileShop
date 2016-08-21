package com.ecommerce.controller;

import com.ecommerce.model.BillingAddress;
import com.ecommerce.model.Customer;
import com.ecommerce.model.ShippingAddress;
import com.ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

/**
 * Created by Alx on 8/20/2016.
 */

@Controller
@RequestMapping("/customer/order")
@SessionAttributes("customer")
public class OrderController {

    @Autowired
    CustomerService customerService;

    @RequestMapping
    public String getClientInfo(@ModelAttribute Customer customer, Model model) {
        BillingAddress billingAddress = customer.getBillingAddress();
        ShippingAddress shippingAddress = customer.getShippingAddress();
        model.addAttribute("customer", customer);
        System.out.println(customer.getEmail());
        return "editCustomer";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String getClientInfoPost(@Valid @ModelAttribute Customer customer, BindingResult result) {
        if (result.hasErrors()) {
            return "editCustomer";
        }
        customerService.editCustomer(customer);
        if (customer.getCart().getCartItems().size() < 1) {
            return "cart";
        }
        return "redirect:/customer/order/confirmation";
    }

    @RequestMapping("/confirmation")
    public String orderConfirmation(@ModelAttribute Customer customer, Model model) {
        //de pus conditie cart sa fie >0;
        model.addAttribute("customer", customer);
        return "orderConfirmation";
    }

}
