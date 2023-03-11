package com.example.shoppingcartv2.controller;

import com.example.shoppingcartv2.service.UserAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserAuthenticationController {
    @Autowired
    UserAuthenticationService userAuthentication;
@GetMapping("/Login/{email}/{password}")
    public ResponseEntity<Object>userLogin(@PathVariable("email") String email,@PathVariable("password") String password){
     Boolean res=userAuthentication.userLogin(email,password);
     if(res){
         return new ResponseEntity<>("User Login Successfully", HttpStatus.ACCEPTED);
     }else return new ResponseEntity<>("Check Login Details",HttpStatus.ACCEPTED);
    }
}
