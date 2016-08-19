package com.ecommerce.dao.impl;

import com.ecommerce.dao.AbstractDao;
import com.ecommerce.dao.CartItemDao;
import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alx on 8/18/2016.
 */
@Repository
public class CartItemDaoImpl extends AbstractDao<CartItem, Integer> implements CartItemDao{



}
