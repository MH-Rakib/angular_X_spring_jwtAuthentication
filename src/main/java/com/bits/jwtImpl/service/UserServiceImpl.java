package com.bits.jwtImpl.service;

import com.bits.jwtImpl.dao.UserDao;
import com.bits.jwtImpl.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {

        return (List<User>) userDao.findAll();
    }

    @Override
    public User getUserByID(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public User addUser(User user) {
        return userDao.save(user);
    }
}
