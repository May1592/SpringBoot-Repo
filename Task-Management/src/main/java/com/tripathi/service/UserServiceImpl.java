package com.tripathi.service;

import com.tripathi.dao.UserDao;
import com.tripathi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(Integer userId) {

    }

    @Override
    public void deleteUser(Integer userId) {

    }

    @Override
    public User getUserByUserId(Integer userId) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
}
