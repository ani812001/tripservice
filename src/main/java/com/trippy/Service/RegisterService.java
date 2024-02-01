package com.trippy.Service;
import com.trippy.entity.User;
import com.trippy.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;


@Service
public class RegisterService {

    @Autowired
    private UserRepo userRepo;

    public User saveDetails(User u) {
        try {
            return userRepo.save(u);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("User with this email already exists");
        }
    }
}
