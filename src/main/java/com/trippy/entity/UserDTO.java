package com.trippy.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {
    @JsonProperty
    private String email ;
    @JsonProperty
    private String password;
}
