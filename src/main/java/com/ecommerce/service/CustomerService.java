package com.ecommerce.service;

import com.ecommerce.dao.*;
import com.ecommerce.dao.impl.AuthoritiesDaoImpl;
import com.ecommerce.model.Authorities;
import com.ecommerce.model.Cart;
import com.ecommerce.model.Customer;
import com.ecommerce.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Alx on 8/15/2016.
 */

@Service
public class CustomerService {


    @Autowired
    CustomerDao customerDao;

    @Autowired
    UsersDao usersDao;

    @Autowired
    AuthoritiesDaoImpl authoritiesDao;

    @Autowired
    BillingAddressDao billingAddressDao;

    @Autowired
    ShippingAddressDao shippingAddressDao;

    @Autowired
    CartDao cartDao;

    @Transactional
    public void addCustomer(Customer customer) {
        customer.getBillingAddress().setCustomer(customer);
        customer.getShippingAddress().setCustomer(customer);
        billingAddressDao.save(customer.getBillingAddress());
        shippingAddressDao.save(customer.getShippingAddress());

        Users newUser = new Users();
        newUser.setUsername(customer.getUsername());
        newUser.setPassword(customer.getPassword());
        newUser.setEnabled(true);

        Authorities newAuthorities = new Authorities();
        newAuthorities.setUsername(customer.getUsername());
        newAuthorities.setAuthority("ROLE_USER");

        usersDao.save(newUser);
        authoritiesDao.save(newAuthorities);

        Cart newCart = new Cart();
        newCart.setCustomer(customer);
        newCart.setCartPrice(BigDecimal.valueOf(0));

        cartDao.save(newCart);
    }


    @Transactional
    public List<Customer> findAllCustomers() {
        List<Customer> customers = customerDao.findAll();
        return customers;
    }

    @Transactional
    public Customer findCustomerById(int customerId) {
        return customerDao.findById(customerId);
    }

    @Transactional
    public Customer findCustomerByUsername(String username) {
        return customerDao.findCustomerByUsername(username);
    }

}
