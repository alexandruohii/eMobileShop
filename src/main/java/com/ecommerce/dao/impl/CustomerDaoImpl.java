package com.ecommerce.dao.impl;

import com.ecommerce.dao.AbstractDao;
import com.ecommerce.dao.CustomerDao;
import com.ecommerce.model.Customer;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Alx on 8/15/2016.
 */

@Repository
public class CustomerDaoImpl extends AbstractDao<Customer, Integer> implements CustomerDao{


    public Customer findCustomerByUsername(String username){
        Query query = getSession().createQuery("from Customer where username = ?");
        query.setString(0, username);
        return (Customer) query.uniqueResult();
    }

}
