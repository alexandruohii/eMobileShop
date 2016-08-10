package com.ecommerce.service;

import com.ecommerce.dao.DvdDao;
import com.ecommerce.dao.GameDao;
import com.ecommerce.dao.ProductDao;
import com.ecommerce.model.Game;
import com.ecommerce.model.Product;
import org.hibernate.Query;
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
    @Autowired
    private DvdDao dvdDaodao;
    @Autowired
    private GameDao gameDao;


    @Transactional
    public List<Game> listGames() {
        return gameDao.findAll();
    }

    @Transactional
    public List<Product> listProduct(String type) {

        return productDao.findAll(type);

    }

    @Transactional
    public List<String> getlistTypes(){
        List<String> listTypes = productDao.getlistTypes();
        return listTypes;
    }

    @Transactional
    public Product findById(int id){
        Product product = productDao.findById(id);
        return product;
    }


}