package com.xworkz.signin.service;


import com.xworkz.signin.dto.UserDTO;

public interface UserService {
    boolean register(UserDTO user);
    boolean authenticate(String userId, String password);
}
