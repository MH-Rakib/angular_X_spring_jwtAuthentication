package com.bits.jwtImpl.dao;

import com.bits.jwtImpl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserDao extends CrudRepository<User, Long> {

}
