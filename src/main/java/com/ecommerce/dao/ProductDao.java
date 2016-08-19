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
public class ProductDao extends AbstractDao<Product, Integer> {

    @SuppressWarnings("unchecked")
    public List<Product> findAllByType(String type) {
        Query query = getSession().createQuery("from Product where phoneType=?");
        query.setParameter(0, type);
        List<Product> products = query.list();
        return products;
    }

}
