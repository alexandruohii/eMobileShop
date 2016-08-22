package com.ecommerce.service;

import com.ecommerce.dao.OrderDao;
import com.ecommerce.model.Customer;
import com.ecommerce.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Alx on 8/22/2016.
 */

@Service
public class OrderService {

    @Autowired
    OrderDao orderDao;

    @Transactional
    public void saveOrder (Order order){
       orderDao.save(order);

    }
}
