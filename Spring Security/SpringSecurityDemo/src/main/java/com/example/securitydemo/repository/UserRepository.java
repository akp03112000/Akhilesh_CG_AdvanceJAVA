package com.example.securitydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.securitydemo.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}