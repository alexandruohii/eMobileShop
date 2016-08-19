package com.ecommerce.dao;

import com.ecommerce.model.Authorities;
import com.ecommerce.model.Cart;
import com.ecommerce.model.Customer;
import com.ecommerce.model.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Alx on 8/15/2016.
 */

@Repository
public class CustomerDao extends AbstractDao <Customer, Integer> {


    public Customer findCustomerByUsername(String username){
        Query query = getSession().createQuery("from Customer where username = ?");
        query.setString(0, username);
        return (Customer) query.uniqueResult();
    }

}
