package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;





import com.example.demo.entities.Company;
//CompanyRepository.java
public interface CompanyRepository extends JpaRepository<Company, Long> {

 List<Company> findByEmployeesBetween(int minEmployees, int maxEmployees);

boolean existsById(Long id);



 // Add other custom queries as needed
}

