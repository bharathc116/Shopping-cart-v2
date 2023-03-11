package com.example.shoppingcartv2.repository;

import com.example.shoppingcartv2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;


import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    

    User findByEmail(String email);




    User findByName(String name);
}
