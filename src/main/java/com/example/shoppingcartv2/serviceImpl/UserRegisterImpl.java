package com.example.shoppingcartv2.serviceImpl;

import com.example.shoppingcartv2.model.User;
import com.example.shoppingcartv2.repository.UserRepo;
import com.example.shoppingcartv2.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class UserRegisterImpl implements UserRegisterService {
    @Autowired
    UserRepo userRepo;

    @Override
    public User registerUser(User user) {
        return userRepo.save(user);
    }
}








