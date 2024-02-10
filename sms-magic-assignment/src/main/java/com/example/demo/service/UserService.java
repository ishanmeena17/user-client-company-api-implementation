package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

//UserService.java
@Service
public class UserService {

 @Autowired
 private UserRepository userRepository;

 public List<User> listUsers(String username) {
     if (username != null) {
         // Implement filtering logic based on the username
         return userRepository.findByUsername(username);
     } else {
         return userRepository.findAll();
     }
 }

 public void updateUser(Long userId, User updatedUser) {
     // Implement logic to update user fields
     Optional<User> optionalUser = userRepository.findById(userId);
     if (optionalUser.isPresent()) {
         User existingUser = optionalUser.get();
         // Update fields based on the 'updatedUser' object
         // Setters for other fields need to be implemented in the User entity
         existingUser.setEmail(updatedUser.getEmail());
         // Update other fields as needed
         userRepository.save(existingUser);
     } else {
         // Handle not found scenario
         //throw new EntityNotFoundException("User with ID " + userId + " not found");
    	 System.out.println("entity not found ");
     }
 }

 // Add other methods as needed
}
