package com.example.shoppingcartv2.serviceImpl;

import com.example.shoppingcartv2.model.User;
import com.example.shoppingcartv2.repository.UserRepo;
import com.example.shoppingcartv2.service.UserAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticationServiceImpl implements UserAuthenticationService {
    @Autowired
    UserRepo userRepo;
    @Override
    public Boolean userLogin(String email, String password) {
        User u=userRepo.findByEmail(email);
        return u.getPassword().equals(password);
    }
}
