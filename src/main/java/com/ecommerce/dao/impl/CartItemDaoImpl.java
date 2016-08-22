package com.ecommerce.dao.impl;

import com.ecommerce.dao.AbstractDao;
import com.ecommerce.dao.CartItemDao;
import com.ecommerce.model.CartItem;
import org.springframework.stereotype.Repository;

/**
 * Created by Alx on 8/18/2016.
 */
@Repository
public class CartItemDaoImpl extends AbstractDao<CartItem, Integer> implements CartItemDao {


}
