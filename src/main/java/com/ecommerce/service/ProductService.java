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
    public List<Product> findAll() {return productDao.findAll();}

    @Transactional
    public List<Product> findAllByType(String type) {
        return productDao.findAllByType(type);
    }

    @Transactional
    public Product findById(int id) {return productDao.findById(id);}

    @Transactional
    public void add(Product product) {
        productDao.save(product);
    }

    @Transactional
    public void delete(Product product) {
        productDao.delete(product);
    }
}