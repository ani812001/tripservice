package com.trippy.controller;

import com.trippy.entity.User;
import com.trippy.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Autowired
    private UserService userService;

//    private String registeredUser;

    @PostMapping("/addUser")
    public User postUserDetails(@RequestBody User user) {
        return userService.saveUser(user);
    }


    @GetMapping("/user")
    public ResponseEntity<User> getUser(@RequestParam(name = "email") String email) {
        return ResponseEntity.ok(userService.getUserByEmail(email));
    }
}







