package com.ecommerce.dao;

import com.ecommerce.dao.interfaces.Dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Alx on 8/9/2016.
 */


public class AbstractDao<T, ID extends Serializable> implements Dao<T, ID> {


    @Autowired
    private SessionFactory sessionFactory;

    private Class<T> persistentClass;
    private Session session;


    @SuppressWarnings("unchecked")
    public AbstractDao() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T findById(ID id) {
        return (T) getSession().get(this.getPersistentClass(), id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> findAll() {
        return getSession().createCriteria(getPersistentClass()).list();
    }


    @Override
    public void save(T entity) {
        getSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(T entity) {
        getSession().delete(entity);
    }


    protected Session getSession() {

            session = sessionFactory.getCurrentSession();

        return this.session;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
