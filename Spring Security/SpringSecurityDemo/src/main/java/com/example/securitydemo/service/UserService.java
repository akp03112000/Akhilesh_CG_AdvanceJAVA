package com.example.securitydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.securitydemo.entity.User;
import com.example.securitydemo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private PasswordEncoder encoder;

    public User register(User user) {

        user.setPassword(encoder.encode(user.getPassword()));

        return repo.save(user);
    }
}