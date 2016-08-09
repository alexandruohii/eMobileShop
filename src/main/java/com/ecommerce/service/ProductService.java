package com.ecommerce.service;

import com.ecommerce.dao.GameDao;
import com.ecommerce.model.Game;
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
        private GameDao gameDao;


        @Transactional
        public List<Game> listGames() {
            return gameDao.findAll();
        }



}
