package com.ecommerce.dao;

import com.ecommerce.model.Customer;

/**
 * Created by Alx on 8/20/2016.
 */
public interface CustomerDao extends Dao <Customer,Integer> {

    Customer findCustomerByUsername(String username);
}
