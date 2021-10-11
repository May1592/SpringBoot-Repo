package com.tripathi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class BaseDaoImpl implements BaseDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public void create(Object object) {
        getSession().save(object);
    }

    @Override
    public Object read( Object object) {
        return null;
    }

    @Override
    public void update(Object object) {
        getSession().update(object);
    }

    @Override
    public void delete(Object object) {
        getSession().delete(object);
    }
}
