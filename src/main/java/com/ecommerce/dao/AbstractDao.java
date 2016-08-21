package com.ecommerce.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Alx on 8/20/2016.
 */
public class AbstractDao<T, ID extends Serializable> implements Dao<T, ID> {


    @Autowired
    protected SessionFactory sessionFactory;

    private Class<T> clazz;

    @SuppressWarnings("unchecked")
    protected AbstractDao() {
        this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public T findById(ID id) {
        return (T) getSession().get(this.clazz, id);
    }

    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        Criteria crit = this.getSession().createCriteria(this.clazz);
        return (List<T>) crit.list();
    }

    public T save(T entity) {
        this.getSession().saveOrUpdate(entity);
        return entity;
    }

    public void delete(T entity) {
        this.getSession().delete(entity);
    }


}
