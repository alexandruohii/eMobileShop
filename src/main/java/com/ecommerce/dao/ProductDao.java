package com.ecommerce.dao;

import com.ecommerce.model.Product;

import java.util.List;

/**
 * Created by Alx on 8/20/2016.
 */
public interface ProductDao extends Dao<Product, Integer> {

    List<Product> findAllByType(String type);
}
