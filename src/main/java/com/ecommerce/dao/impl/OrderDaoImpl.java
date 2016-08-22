package com.ecommerce.dao.impl;

import com.ecommerce.dao.AbstractDao;
import com.ecommerce.dao.OrderDao;
import com.ecommerce.model.Order;
import org.springframework.stereotype.Repository;

/**
 * Created by Alx on 8/22/2016.
 */

@Repository
public class OrderDaoImpl extends AbstractDao<Order, Integer> implements OrderDao {
}
