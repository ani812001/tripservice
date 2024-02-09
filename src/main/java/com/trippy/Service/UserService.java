
package com.trippy.Service;

import com.trippy.entity.User;
import com.trippy.Repository.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepo userRepo;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public User saveUser(User user) {
        try {


            if (user == null || user.getEmail() == null || user.getEmail().isEmpty()) {
                log.warn("Invalid user or email provided for saving");
                return null;
            }

            return userRepo.save(user);
        } catch (DataIntegrityViolationException e) {

            log.error("Error saving user: {}", e.getMessage());
            return null;
        }
    }

    public List<User> getAllUsers() {
        log.info("Getting all users");
        return userRepo.findAll();
    }

    public User getUserByEmail(String email) {

        if (email == null || email.isEmpty()) {
            log.warn("Invalid email provided for user lookup");
            return null;
        }

        return userRepo.findByEmail(email);
    }

    public boolean authenticateUser(String email, String password) {
        // Validate input
        if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
            log.warn("Invalid email or password provided for authentication");
            return false;
        }

        User user = getUserByEmail(email);
        return user != null && password.equals(user.getPassword());
    }

    public  User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

}
