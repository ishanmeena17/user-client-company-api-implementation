package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CompanyRepository;import com.example.demo.entities.Company;

//CompanyService.java
@Service
public class CompanyService {

 @Autowired
 private CompanyRepository companyRepository;

 public List<Company> searchCompaniesByEmployeeRange(int minEmployees, int maxEmployees) {
     return companyRepository.findByEmployeesBetween(minEmployees, maxEmployees);
 }

 // Add other methods as needed
}

