package com.ecommerce.service;

import com.ecommerce.dao.ProductDao;
import com.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alx on 8/9/2016.
 */
@Service
public class ProductService {


    @Autowired
    private ProductDao productDao;


    @Transactional
    public List<Product> findAll() {

        return productDao.findAll();
    }

    @Transactional
    public List<Product> findAllByType(String type) {
        return productDao.findAllByType(type);
    }


    @Transactional
    public Product findPhoneById(int id) {
        Product product = productDao.findPhoneById(id);
        return product;
    }

    @Transactional
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Transactional
    public void editProduct(Product product) {
        productDao.editProduct(product);
    }

    @Transactional
    public void deleteProduct(Product product) {
        productDao.deleteProduct(product);
    }
}