package com.example.TaskManager.controller;

import com.example.TaskManager.model.Users;
import com.example.TaskManager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) { // contsructor injection
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<Users>> getUsers() {
        List<Users> users = userService.getAllUsers();
        if (users.isEmpty()) {
            return new ResponseEntity<>(users,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok(users);
    }

    @PostMapping
    public ResponseEntity<String> addUser(@RequestBody Users user) {
        if (user.getUsername().isEmpty()) {
            return new ResponseEntity<>("Username cannot be null", HttpStatus.BAD_REQUEST);
        }
        if (user.getPassword().isEmpty()) {
            return new ResponseEntity<>("Password cannot be null", HttpStatus.BAD_REQUEST);
        }
        if(user.getEmail().isEmpty()) {
            return new ResponseEntity<>("Username cannot be empty", HttpStatus.BAD_REQUEST);
        }

        userService.addUser(user);
        return new ResponseEntity<>("User added successfully", HttpStatus.CREATED);
    }
}
