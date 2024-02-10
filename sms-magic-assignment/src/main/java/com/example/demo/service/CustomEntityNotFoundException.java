package com.example.demo.service;

//CustomEntityNotFoundException.java
public class CustomEntityNotFoundException extends RuntimeException {

 public CustomEntityNotFoundException(String entityName, Long entityId) {
     super("Entity " + entityName + " with ID " + entityId + " not found");
 }

 // You can add more constructors or methods as needed
}
