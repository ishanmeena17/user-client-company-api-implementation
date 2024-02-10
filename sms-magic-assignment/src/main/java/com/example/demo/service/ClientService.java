package com.example.demo.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Client;
import com.example.demo.entities.Company;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.CompanyRepository;

import jakarta.persistence.EntityExistsException;

//ClientService.java
@Service
public class ClientService {

 @Autowired
 private ClientRepository clientRepository;

 @Autowired
 private CompanyRepository companyRepository;

 @Autowired
 private UserService userService;

// public void createClient(Client newClient) {
//     // Validate that the company used isn't taken by other clients
//     Company company = newClient.getCompany();
//     if (companyRepository.existsById(company.getId())) {
//         throw new EntityExistsException("Company with ID " + company.getId() + " is already associated with a client");
//     }
//
//     // Validate other constraints if needed
//
//     clientRepository.save(newClient);
// }
 public void createClient(Client newClient) {
		// TODO Auto-generated method stub
//   // Validate that the company used isn't taken by other clients
   Company company = newClient.getCompany();
   if (companyRepository.existsById(company.getId())) {
       throw new EntityExistsException("Company with ID " + company.getId() + " is already associated with a client");
   }

   // Validate other constraints if needed

   clientRepository.save(newClient);
		
	}

 public void updateClient(Long clientId, Map<String, Object> updates) {
     Optional<Client> optionalClient = clientRepository.findById(clientId);
     if (optionalClient.isPresent()) {
         Client existingClient = optionalClient.get();
         // Update fields based on the 'updates' map
         // Implement logic to handle different update scenarios
         // Setters for other fields need to be implemented in the Client entity
         updates.forEach((key, value) -> {
             switch (key) {
                 case "name":
                     existingClient.setName((String) value);
                     break;
                 case "email":
                     existingClient.setEmail((String) value);
                     break;
                 // Handle other fields
             }
         });

         clientRepository.save(existingClient);
     } else {
         // Handle not found scenario
        // throw new EntityNotFoundException("Client with ID " + clientId + " not found");
    	 System.out.println("not found");
     }
 }





 // Add other methods as needed
}

