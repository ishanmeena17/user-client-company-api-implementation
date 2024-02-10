package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Client;
import com.example.demo.entities.Company;

//ClientRepository.java
public interface ClientRepository extends JpaRepository<Client, Long> {

// Optional<Client> findByCompanyAndDeletedAtIsNull(Company company);
 List<Client> findByCompanyAndDeletedAtIsNull1(Company company);
 List<Client> findByCompanyAndClientUserDeletedAtIsNull(Company company);
 @Query("SELECT c FROM Client c WHERE c.company = :company AND c.deletedAt IS NULL")
 Optional<Client> findByCompanyAndDeletedAtIsNull(@Param("company") Company company);

 // Add other custom queries as needed
}
