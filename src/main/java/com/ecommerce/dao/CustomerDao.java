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
@Transactional
public class CustomerDao {


    @Autowired
    private SessionFactory sessionFactory;


    public void addCustomer(Customer customer){
        Session session = sessionFactory.getCurrentSession();
        customer.getBillingAddress().setCustomer(customer);
        customer.getShippingAddress().setCustomer(customer);

        session.saveOrUpdate(customer.getBillingAddress());
        session.saveOrUpdate(customer.getShippingAddress());

        Users newUser = new Users();
        newUser.setUsername(customer.getUsername());
        newUser.setPassword(customer.getPassword());
        newUser.setEnabled(true);

        Authorities newAuthorities = new Authorities();
        newAuthorities.setUsername(customer.getUsername());
        newAuthorities.setAuthority("ROLE_USER");

        session.saveOrUpdate(newUser);
        session.saveOrUpdate(newAuthorities);

        Cart newCart = new Cart();
        newCart.setCustomer(customer);
newCart.setCartPrice(BigDecimal.valueOf(0));
        session.saveOrUpdate(newCart);

        session.flush();
    }

    public List<Customer> findAllCustomers(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Customer");
        List<Customer> customerList = query.list();

        return customerList;

    }


    public Customer findCustomerById(int customerId){
        Session session = sessionFactory.getCurrentSession();
        return (Customer) session.get(Customer.class, customerId);
    }



    public Customer findCustomerByUsername(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Customer where username = ?");
        query.setString(0, username);
        return (Customer) query.uniqueResult();
    }

}
