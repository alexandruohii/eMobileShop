package com.ecommerce.dao;

import java.util.List;

/**
 * Created by Alx on 8/20/2016.
 */
public interface Dao<T, ID> {


    T findById(ID id);

    List<T> findAll();

    void save(T entity);

    void delete(T entity);

}
