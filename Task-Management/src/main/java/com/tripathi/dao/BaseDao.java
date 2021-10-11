package com.tripathi.dao;


public interface BaseDao {
    public void create(Object object);
    public Object read(Object object);
    public void update(Object object);
    public void delete(Object object);
}
