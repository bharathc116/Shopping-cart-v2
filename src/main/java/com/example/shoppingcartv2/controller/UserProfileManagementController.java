package com.example.shoppingcartv2.controller;

import com.example.shoppingcartv2.model.User;
import com.example.shoppingcartv2.service.UserProfileManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1")

public class UserProfileManagementController {
    @Autowired
    UserProfileManagementService userProfileManagementService;
@PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@Valid User user, @PathVariable ("id")Integer id){
        return ResponseEntity.ok(userProfileManagementService.updateUser(user,id));
    }
@GetMapping("/user/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable Integer id){
    return  ResponseEntity.ok().body(userProfileManagementService.getUserById(id));
    }
@GetMapping("/user")
    public List<User> getAllUser(){
    return userProfileManagementService.getAllUser();
    }
@DeleteMapping("/user/{id}")
public ResponseEntity<Object> deleteUser(@PathVariable ("id")Integer id){
    userProfileManagementService.deleteUser(id);
return new ResponseEntity<>("", HttpStatus.NO_CONTENT);
}
}
