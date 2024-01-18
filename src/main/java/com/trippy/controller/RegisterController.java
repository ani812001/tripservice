package com.trippy.controller;

import com.trippy.Entity.User;
import com.trippy.Entity.UserRegisterDTO;
import com.trippy.Service.RegisterService;
import com.trippy.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registration(@RequestBody UserRegisterDTO user) {

        User u = userService.getUserByEmail(user.getEmail());
        if (u != null)
            return (ResponseEntity.badRequest().body("user already exist"));
        else {
            userService.saveUser(Utils.UserRegisterToUserConverter(user));
            ResponseEntity r = new ResponseEntity("user created",HttpStatus.CREATED);
            return r;

        }
    }

    @GetMapping("/users/{email}")
    public ResponseEntity<?> getUserByEmail(@PathVariable String email) {
        try {
            User user = userService.findByEmail(email);
            return ResponseEntity.ok(user);
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }
    }
}








