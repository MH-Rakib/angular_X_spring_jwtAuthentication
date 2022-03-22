package com.bits.jwtImpl.dao;

import com.bits.jwtImpl.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends CrudRepository<User, Long> {

}
