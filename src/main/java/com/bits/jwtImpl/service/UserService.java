package com.bits.jwtImpl.service;

import com.bits.jwtImpl.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserByID(Long id);

    User addUser(User user);

}
