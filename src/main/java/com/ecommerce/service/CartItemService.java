package com.ecommerce.service;

import com.ecommerce.dao.CartItemDao;
import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Alx on 8/17/2016.
 */
@Service
public class CartItemService{

    @Autowired
    private CartItemDao cartItemDao;

    public void addCartItem(CartItem cartItem){
        cartItemDao.addCartItem(cartItem);
    }

    public void removeCartItem(CartItem cartItem){
        cartItemDao.removeCartItem(cartItem);
    }

    public void removeAllCartItems(Cart cart){
        cartItemDao.removeAllCartItems(cart);
    }

    public CartItem getCartItemByProductId(int productId){
        return cartItemDao.getCartItemByProductId(productId);
    }

    public CartItem getCartItemById(int cartItemId) {
        return cartItemDao.getCartItemById(cartItemId);
    }
}