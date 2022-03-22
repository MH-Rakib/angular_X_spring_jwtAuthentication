package com.bits.jwtImpl.controller;


import com.bits.jwtImpl.entity.User;
import com.bits.jwtImpl.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userRestController {

    private UserService userService;

    public userRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String root( ) {
        return "This is the root url";
    }

    @GetMapping(value = "/getAll")
    public List<User> getAll( ) {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/getById/{id}")
    public User getById(@PathVariable Long id) {
        return userService.getUserByID(id);
    }

}
