package com.trippy.controller;

import com.trippy.Entity.Tours;
import com.trippy.Entity.User;
import com.trippy.Service.LoginService;
import com.trippy.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController<Logins> {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User loginUser) {
        String username = loginUser.getUsername();
        String password = loginUser.getPassword();

        boolean isAuthenticated = userService.authenticateUser(username, password);

        if (isAuthenticated) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("wrong credential");
        }



    }
}
