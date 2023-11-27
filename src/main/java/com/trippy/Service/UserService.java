package com.trippy.Service;

import com.trippy.Entity.Users;
import com.trippy.Repository.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
     Logger log = LoggerFactory.getLogger(this.getClass().getName());

     @Autowired
     private UserRepo userRepo;

    public Users saveUser(Users users) {
        return userRepo.save(users);
    }

    public List<Users> getAllUsers() {
        log.info("got user request");
        return userRepo.findAll();
    }

    public Users getUserByEmail(String email){
        return userRepo.findByEmail(email);
    }
}
