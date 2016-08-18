package com.ecommerce.dao;

import com.ecommerce.model.Cart;
import com.ecommerce.model.Customer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Alx on 8/17/2016.
 */

@Repository
@Transactional
public class CartDao {

    @Autowired
    SessionFactory sessionFactory;

    public Cart getCartByCustomerId(Customer customer){
        Session session= sessionFactory.getCurrentSession();
        Query query = session.createQuery("select from Cart where customer.id =?");
        query.setParameter(0, customer.getIdCustomer());
        return (Cart) query.uniqueResult();
    }

    public void getTotalPriceCart(){

    }

}
