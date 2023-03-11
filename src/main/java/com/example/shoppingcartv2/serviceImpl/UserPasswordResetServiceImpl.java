package com.example.shoppingcartv2.serviceImpl;

import com.example.shoppingcartv2.exception.ItemNotFoundException;
import com.example.shoppingcartv2.model.User;
import com.example.shoppingcartv2.repository.UserRepo;
import com.example.shoppingcartv2.service.UserPasswordRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class UserPasswordResetServiceImpl implements UserPasswordRestService {
    @Autowired
    UserRepo userRepo;

    @Override
    public Boolean forgotPassword(String name) {
        User u = userRepo.findByName(name);
        return u.getName().equals(name);
    }

    @Override
    public void changePassword(Integer id, String password) throws ItemNotFoundException {
        User oldUser = userRepo.findById(id).orElseThrow(
                () -> new ItemNotFoundException("inavlid")
        );
        oldUser.setPassword(password);
        userRepo.save(oldUser);
    }

}
