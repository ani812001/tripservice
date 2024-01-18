package com.trippy.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.trippy.Service.UserService;
import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

@Data
public class UserRegisterDTO implements Serializable {

    @JsonProperty
    @NotEmpty(message="email is required")
    private String email;

    @JsonProperty
    @NotEmpty(message = "first_name is required")
    private String firstname;

    @JsonProperty
    @NotEmpty(message = "last_name is required")
    private String lastname;

    @JsonProperty
    @NotEmpty(message="password is required")
    private  String password;



    @JsonProperty
    @NotEmpty(message="mobile is required")
    private String mobile;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy")
    @NotEmpty(message="dob is required")
    private Date dob;  // Date of Birth


    public String getEmail(UserService userService) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public  String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public Date getDateOfBirth() {
            return null;
    }

    public Date getCreatedAt() { return null;}

    public Date getUpdatedAt() { return null;
    }
}

