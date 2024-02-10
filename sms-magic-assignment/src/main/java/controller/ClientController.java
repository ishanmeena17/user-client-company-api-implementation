//package controller;
//
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.entities.Client;
//import com.example.demo.service.ClientService;
//
//
//
////ClientController.java
//@RestController
//@RequestMapping("/api/clients")
//public class ClientController {
//
// @Autowired
// private ClientService clientService;
//
// @PostMapping("/create")
// 
// @PreAuthorize("hasRole('ROLE_ADMIN')")
// public ResponseEntity<Void> createClient(@RequestBody Client newClient) {
//     clientService.createClient(newClient);
//     return ResponseEntity.status(HttpStatus.CREATED).build();
// }
//
// @PatchMapping("/{clientId}")
// public ResponseEntity<Void> updateClient(@PathVariable Long clientId, @RequestBody Map<String, Object> updates) {
//     clientService.updateClient(clientId, updates);
//     return ResponseEntity.noContent().build();
// }
//
// // Add other endpoints as needed
//}
//
