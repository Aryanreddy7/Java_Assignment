package com.xworkz.signin.service;


import com.xworkz.signin.dto.UserDTO;
import com.xworkz.signin.repository.UserRepository;
import com.xworkz.signin.repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService {
    private UserRepository repository = new UserRepositoryImpl();

    @Override
    public boolean register(UserDTO user) {
        return repository.save(user);
    }

    @Override
    public boolean authenticate(String userId, String password) {
        return repository.validate(userId, password);
    }
}
