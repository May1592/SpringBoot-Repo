package com.tripathi.dao;

import com.tripathi.entity.User;

import java.util.List;

public interface UserDao {
    public User getUserByUserId(Integer userId);
    public List<User> getAllUser();
    public void createUser(User user);
}
