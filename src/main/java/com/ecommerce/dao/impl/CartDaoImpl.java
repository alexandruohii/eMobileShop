package com.ecommerce.dao.impl;

import com.ecommerce.dao.AbstractDao;
import com.ecommerce.dao.CartDao;
import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;
import com.ecommerce.model.Customer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Alx on 8/17/2016.
 */

@Repository
public class CartDaoImpl extends AbstractDao<Cart, Integer> implements CartDao {




}
