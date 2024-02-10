package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.User;
import java.util.List;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

 @Autowired
 private UserService userService;

 @GetMapping
 public ResponseEntity<List<User>> listUsers(@RequestParam(required = false) String username) {
     List<User> users = userService.listUsers(username);
     return ResponseEntity.ok(users);
 }

 @PutMapping("/{userId}")
 public ResponseEntity<Void> updateUser(@PathVariable Long userId, @RequestBody User updatedUser) {
     userService.updateUser(userId, updatedUser);
     return ResponseEntity.noContent().build();
 }

 // Add other endpoints as needed
}

