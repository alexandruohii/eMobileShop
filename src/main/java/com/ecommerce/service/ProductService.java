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
    public List<Product> listAll() {

        return productDao.findAll();
    }

    @Transactional
    public List<Product> listAllByType(String type) {
        return productDao.findAllByType(type);
    }



    @Transactional
    public Product findById(int id) {
        Product product = productDao.findById(id);
        return product;
    }

    @Transactional
    public void save(Product product) {
        productDao.save(product);
    }

    @Transactional
    public void delete(Product product) {
        productDao.delete(product);
    }
}