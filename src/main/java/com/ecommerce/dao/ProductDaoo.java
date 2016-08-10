package com.ecommerce.dao;

import com.ecommerce.model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alx on 8/10/2016.
 */
@Repository
@Transactional
public class ProductDaoo {

    @Autowired
    private SessionFactory sessionFactory;


    public Product getProductbyId(int id){
        Session session = sessionFactory.getCurrentSession();
        Product product = (Product) session.get(Product.class, id);
        session.flush();
        return product;
    }

    public List<Product> getProducts(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product ");
        List<Product> products = query.list();
        session.flush();
        return products;

    }
}
