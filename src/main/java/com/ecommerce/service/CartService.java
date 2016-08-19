package com.ecommerce.service;

import com.ecommerce.dao.CartDao;
import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;
import com.ecommerce.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Alx on 8/17/2016.
 */
@Service
public class CartService {


    @Autowired
    CartDao cartDao;

    @Transactional
    public BigDecimal getTotalPriceCart(Cart cart){
        List<CartItem> cartItems = cart.getCartItems();
        BigDecimal totalPrice = new BigDecimal(0);
        for(CartItem cartItem: cartItems){
            totalPrice= totalPrice.add(cartItem.getTotalPrice());

        }
        return totalPrice;
    }
}
