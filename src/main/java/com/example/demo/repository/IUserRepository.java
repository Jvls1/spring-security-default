package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;
import com.example.demo.repository.generic.IGenericRepository;

@Repository
public interface IUserRepository extends IGenericRepository<User> {

    public User findByUsername(String username);
}
