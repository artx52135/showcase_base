package com.example.showcase.controllers;


import com.example.showcase.entity.User;
import com.example.showcase.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createuser(@RequestBody User user) {
        User saveduser = userService.createUser(user);
        return new ResponseEntity<>(saveduser, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int userId) {
        User user = userService.getUserById(userId);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") int userId, @RequestBody User updateuser) {
        User user = userService.updateUser(userId, updateuser);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteuser(@PathVariable("id") int userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok("User is deleted!");
    }
}
