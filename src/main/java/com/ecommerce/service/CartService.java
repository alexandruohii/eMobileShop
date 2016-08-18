package com.ecommerce.service;

import com.ecommerce.dao.CartDao;
import com.ecommerce.model.Cart;
import com.ecommerce.model.Customer;
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


}
