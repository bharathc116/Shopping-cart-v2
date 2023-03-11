package com.example.shoppingcartv2.controller;

import com.example.shoppingcartv2.model.User;
import com.example.shoppingcartv2.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/v1")
public class UserRegisterController {
    @Autowired
    UserRegisterService userRegisterService;

@PostMapping("/register")
    public ResponseEntity<Object> createUser(@RequestBody User user)
    {
        return new ResponseEntity<>(userRegisterService.registerUser(user), HttpStatus.CREATED);

    }
}
