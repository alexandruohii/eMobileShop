package com.ecommerce.dao.impl;

import com.ecommerce.dao.AbstractDao;
import com.ecommerce.dao.OrderItemDao;
import com.ecommerce.model.OrderItem;
import org.springframework.stereotype.Repository;

/**
 * Created by Alx on 8/22/2016.
 */
@Repository
public class OrderItemDaoImpl extends AbstractDao<OrderItem, Integer> implements OrderItemDao {
}
