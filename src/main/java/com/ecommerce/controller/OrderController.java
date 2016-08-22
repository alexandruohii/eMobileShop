package com.ecommerce.controller;

import com.ecommerce.model.BillingAddress;
import com.ecommerce.model.Customer;
import com.ecommerce.model.Order;
import com.ecommerce.model.ShippingAddress;
import com.ecommerce.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Alx on 8/20/2016.
 */

@Controller
@RequestMapping("/customer/order")
@SessionAttributes("customer")
public class OrderController {

    @Autowired
    CustomerService customerService;

    @Autowired
    OrderItemService orderItemService;

    @Autowired
    OrderService orderService;

    @Autowired
    CartService cartService;

    @Autowired
    CartItemService cartItemService;

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

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date orderDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, +2);
        Date shippingDate = calendar.getTime();

        model.addAttribute("orderDate", dateFormat.format(orderDate));
        model.addAttribute("shippingDate", dateFormat.format(shippingDate));
        return "orderConfirmation";
    }

    @RequestMapping(value = "/confirmation", method = RequestMethod.POST)
    public String orderConfirmationPost(@ModelAttribute Customer customer, @ModelAttribute("orderDate") Date orderDate) {
        Order order = new Order();
        order.setCustomer(customer);
        order.setOrderItems(orderItemService.getOrderItems(customer, order));
        order.setOrderPrice(cartService.getTotalPriceCart(customer.getCart()));
        order.setShipped(false);
        order.setOrderDate(orderDate);
        orderService.saveOrder(order);
        cartService.setCartPriceToZero(customer.getCart()); //resetare pret cart
        cartItemService.removeAllCartItems(customer.getCart()); // golire cart

        return "orderSuccess";
    }

}
