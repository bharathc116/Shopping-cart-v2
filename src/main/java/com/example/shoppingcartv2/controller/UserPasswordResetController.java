package com.example.shoppingcartv2.controller;

import com.example.shoppingcartv2.exception.ItemNotFoundException;

import com.example.shoppingcartv2.repository.UserRepo;
import com.example.shoppingcartv2.service.UserPasswordRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("api/v2")
public class UserPasswordResetController {
    @Autowired
    UserPasswordRestService uPassword;

//    @Autowired
//    UserRepo userRepo;
//    @PostMapping("/forgotPassword")
//    public ResponseEntity<Object> forgotPassword( @PathVariable("name") String name)
//    {
//        Boolean res=uPassword.forgotPassword(name);
//        if(res)
//        {
//            return new ResponseEntity<>("Request ok",HttpStatus.ACCEPTED);
//        }else
//
//            return new ResponseEntity<>("Invalid Details",HttpStatus.ACCEPTED);
//
//
//    }
    @PutMapping("/changePassword/{id}")
    public ResponseEntity<Object> changePassword(@PathVariable("id")Integer id,@RequestBody String password)
    {
        try{
            uPassword.changePassword(id,password);
            return  new ResponseEntity<>(id,HttpStatus.OK);
        }catch (ItemNotFoundException e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);

        }
    }



}



