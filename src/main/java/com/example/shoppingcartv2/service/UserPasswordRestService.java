package com.example.shoppingcartv2.service;

import com.example.shoppingcartv2.exception.ItemNotFoundException;

import java.math.BigInteger;

public interface UserPasswordRestService {

    Boolean forgotPassword( String name);

    void changePassword(Integer id,String password) throws ItemNotFoundException;
}