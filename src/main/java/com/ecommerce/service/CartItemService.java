package com.ecommerce.service;

import com.ecommerce.dao.CartItemDao;
import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alx on 8/17/2016.
 */
@Service
public class CartItemService {

    @Autowired
    private CartItemDao cartItemDao;

    @Transactional
    public void addCartItem(CartItem cartItem) {
        cartItemDao.save(cartItem);
    }

    @Transactional
    public void removeCartItem(CartItem cartItem) {
        cartItemDao.delete(cartItem);
    }

    @Transactional
    public void removeAllCartItems(Cart cart) {
        List<CartItem> cartItems = cart.getCartItems();
        for (CartItem item : cartItems) {
            removeCartItem(item);
        }
    }

    @Transactional
    public CartItem findCartItemById(int cartItemId) {
        return cartItemDao.findById(cartItemId);
    }
}