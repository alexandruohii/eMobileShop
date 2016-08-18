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
public class ProductDao {


    @Autowired
    private SessionFactory sessionFactory;


    public List<Product> findAll() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product");
        List<Product> productList = query.list();
        session.flush();

        return productList;
    }

    @SuppressWarnings("unchecked")
    public List<Product> findAllByType(String type) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product where phoneType=?");
        query.setParameter(0, type);
        List<Product> products = query.list();
        return products;
    }


    public Product findPhoneById (int id){
        Session session = sessionFactory.getCurrentSession();
        Product product = (Product) session.get(Product.class, id);
        session.flush();

        return product;
    }

    public void addProduct (Product product){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }

    public void editProduct (Product product){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }

    public void deleteProduct (Product product){
        Session session = sessionFactory.getCurrentSession();
        session.delete(product);
        session.flush();
    }

}
