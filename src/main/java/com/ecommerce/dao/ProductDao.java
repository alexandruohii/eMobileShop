package com.ecommerce.dao;

import com.ecommerce.model.Product;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Alx on 8/10/2016.
 */
@Repository
public class ProductDao extends AbstractDao<Product, Integer> {

    private Query query;

    @SuppressWarnings("unchecked")
    public List<Product> findAll() {
        Query query = getSession().createQuery("from Product");
        List<Product> products = query.list();
        return products;
    }

    @SuppressWarnings("unchecked")
    public List<Product> findAllByType(String type) {
        Query query = getSession().createQuery("from Product where phoneType=?");
        query.setParameter(0, type);
        List<Product> products = query.list();
        return products;
    }


    @SuppressWarnings("unchecked")
    public Product findById(int id) {
        Product product =(Product) getSession().get(Product.class, id);
        return product;
    }

}
