package com.ecommerce.dao;

import com.ecommerce.model.Product;

import java.util.List;

/**
 * Created by Alx on 8/9/2016.
 */
public interface ProductDao {

    void addProduct(Product product);

    Product getProductById(int id);
    List<Product> getAllProductsByType(String productType);

    List<Product> getAllProducts();

    void deleteProduct(int id);

}