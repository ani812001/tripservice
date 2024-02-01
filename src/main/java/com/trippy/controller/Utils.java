package com.trippy.controller;

import com.trippy.entity.User;
import com.trippy.entity.UserRegisterDTO;

import java.util.Calendar;

public class Utils {

    public static User UserRegisterToUserConverter(UserRegisterDTO userRegisterDTO){
        User u = new User();
        u.setEmail(userRegisterDTO.getEmail());
        u.setCreatedAt(Calendar.getInstance().getTime());
        u.setFirstname(userRegisterDTO.getFirstname());
        u.setLastname(userRegisterDTO.getLastname());
        u.setPassword(userRegisterDTO.getPassword());
        u.setDob(userRegisterDTO.getDob());
        u.setMobile(userRegisterDTO.getMobile());
        return u;
    }
}
