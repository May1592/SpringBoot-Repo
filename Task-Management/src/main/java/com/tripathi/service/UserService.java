package com.tripathi.service;

import com.tripathi.entity.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public void updateUser(Integer userId);
    public void deleteUser(Integer userId);
    public User getUserByUserId(Integer userId);
    public List<User> getAllUser();
}


