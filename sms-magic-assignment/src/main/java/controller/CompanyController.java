package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Company;
import com.example.demo.service.CompanyService;

//CompanyController.java
@RestController
@RequestMapping("/api/companies")
public class CompanyController {

 @Autowired
 private CompanyService companyService;

 @GetMapping("/search")
 public ResponseEntity<List<Company>> searchCompanies(@RequestParam int minEmployees, @RequestParam int maxEmployees) {
     List<Company> companies = companyService.searchCompaniesByEmployeeRange(minEmployees, maxEmployees);
     return ResponseEntity.ok(companies);
 }

 // Add other endpoints as needed
}

