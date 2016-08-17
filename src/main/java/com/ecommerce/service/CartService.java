package com.ecommerce.service;

import com.ecommerce.dao.interfaces.CartDao;
import com.ecommerce.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Alx on 8/17/2016.
 */
@Service
public class CartService {


    @Autowired
    CartDao cartDao;

    @Transactional
    public void save(Cart cart) {
        cartDao.save(cart);
    }
}
