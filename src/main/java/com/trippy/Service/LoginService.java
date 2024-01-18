package com.trippy.Service;

import com.trippy.Entity.Login;
import com.trippy.Repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginRepo loginRepo;

    public Login saveDetail(Login loginEntity ){
        return loginRepo.save(loginEntity);
    }

    public List <Login> getAllLogins(){
        System.out.println("Login Successful");
        return loginRepo.findAll();
    }
}
