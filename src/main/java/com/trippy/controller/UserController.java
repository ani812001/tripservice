package com.trippy.controller;

import com.trippy.Entity.Users;
import com.trippy.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
  Logger logger = LoggerFactory.getLogger(getClass().getName());
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public Users postUserDetails(@RequestBody Users user) {
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public ResponseEntity<List<Users>> getUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/user")
    public ResponseEntity<Users> getUser(@RequestParam(name = "email") String email){
        return ResponseEntity.ok(userService.getUserByEmail(email));
    }
}
