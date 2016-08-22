package com.ecommerce.dao.impl;

import com.ecommerce.dao.AbstractDao;
import com.ecommerce.dao.ProductDao;
import com.ecommerce.model.Product;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Alx on 8/10/2016.
 */
@Repository
public class ProductDaoImpl extends AbstractDao<Product, Integer> implements ProductDao{

    @SuppressWarnings("unchecked")
    public List<Product> findAllByType(String type) {
        Query query = getSession().createQuery("from Product where phoneType=?");
        query.setParameter(0, type);
        return query.list();
    }

}
