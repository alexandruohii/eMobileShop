package com.ecommerce.dao;

import com.ecommerce.model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Alx on 8/10/2016.
 */
@Repository
public class ProductDao extends AbstractDao<Product, Integer> {



    @SuppressWarnings("unchecked")
    public List<Product> findAll(String type) {
        Query query = getSession().createQuery("from Product where type=?");
        query.setParameter(0, type);
        List<Product> products = query.list();
        return products;
    }


    @SuppressWarnings("unchecked")
    public List<String> getlistTypes() {
        Query query = getSession().createQuery("select distinct type from Product");
        List<String> listTypes = query.list();
        return listTypes;
    }

    @SuppressWarnings("unchecked")
    public Product findById(int id) {
        Product product =(Product) getSession().get(Product.class, id);
        return product;
    }

}
