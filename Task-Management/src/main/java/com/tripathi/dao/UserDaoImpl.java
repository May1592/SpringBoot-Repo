package com.tripathi.dao;

import com.tripathi.entity.User;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

    @Override
    public User getUserByUserId(Integer userId) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return getSession().createQuery("from User").list();
    }

    @Override
    public void createUser(User user) {

    }
}
