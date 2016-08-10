package com.ecommerce.dao.interfaces;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Alx on 8/9/2016.
 */
public interface Dao<T, ID extends Serializable>{

    T findById(ID id);

    List<T> findAll();

    void save(T entity);

    void delete(T entity);
}
