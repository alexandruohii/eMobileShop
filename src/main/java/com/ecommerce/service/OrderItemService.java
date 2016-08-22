package com.ecommerce.service;

import com.ecommerce.dao.OrderItemDao;
import com.ecommerce.model.CartItem;
import com.ecommerce.model.Customer;
import com.ecommerce.model.Order;
import com.ecommerce.model.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alx on 8/22/2016.
 */
@Service
public class OrderItemService {

    @Autowired
    OrderItemDao orderItemDao;

    @Transactional
    public List<OrderItem> getOrderItems(Customer customer, Order order) {
        List<CartItem> cartItems = customer.getCart().getCartItems();
        List<OrderItem> orderItems = new ArrayList<OrderItem>();
        for (CartItem cartItem : cartItems) {
            OrderItem orderItem = new OrderItem();
            orderItem.setProduct(cartItem.getProduct());
            orderItem.setQuantity(cartItem.getQuantity());
            orderItem.setTotalPrice(cartItem.getTotalPrice());
            orderItem.setOrder(order);
            orderItems.add(orderItem);
        }
        return orderItems;
    }

    @Transactional
    public List<OrderItem> getOrderItems() {
        return orderItemDao.findAll();
    }
}
