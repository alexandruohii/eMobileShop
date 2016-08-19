package com.ecommerce.dao;

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
public class CartItemDao extends AbstractDao<CartItem, Integer>{



}
