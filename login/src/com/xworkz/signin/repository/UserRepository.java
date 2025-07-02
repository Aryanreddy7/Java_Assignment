package com.xworkz.signin.repository;


import com.xworkz.signin.dto.UserDTO;

public interface UserRepository {
    boolean save(UserDTO user);
    boolean validate(String userId, String password);
}
