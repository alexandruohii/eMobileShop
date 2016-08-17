package com.ecommerce.dao;

import com.ecommerce.model.Customer;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Alx on 8/15/2016.
 */

@Repository
public class CustomerDao extends AbstractDao<Customer, Integer> {

   public Customer existCustomer(String username, String password ){
       Query query = getSession().createQuery("from Customer where username=? and password=?");
       query.setParameter(0, username);
       query.setParameter(1, password );

       return (Customer)query.uniqueResult();
   }

}
