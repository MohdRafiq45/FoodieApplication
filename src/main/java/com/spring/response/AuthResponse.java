package com.spring.response;

import com.spring.model.USER_ROLE;
import com.spring.model.User;
import lombok.Data;

@Data
public class AuthResponse {
    private  String jwt;
    private  String message;
    private USER_ROLE role;
}
