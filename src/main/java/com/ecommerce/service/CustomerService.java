package com.ecommerce.service;

import com.ecommerce.dao.CustomerDao;
import com.ecommerce.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alx on 8/15/2016.
 */

@Service
public class CustomerService {


    @Autowired
    CustomerDao customerDao;

    @Transactional
    public void saveCustomer(Customer customer) {
        customerDao.save(customer);
    }


    @Transactional
    public List<Customer> findAllCustomers(){
        List<Customer> customers = customerDao.findAll();
        return customers;
    }

    @Transactional
    public Customer getCustomerByUsername(String username, String password){
        return customerDao.existCustomer(username,password);

    }

}
