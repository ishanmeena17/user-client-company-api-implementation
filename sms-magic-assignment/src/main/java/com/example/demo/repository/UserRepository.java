package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.User;
//UserRepository.java
public interface UserRepository extends JpaRepository<User, Long> {

 List<User> findByUsername(String username);

 // Add other custom queries as needed
}
