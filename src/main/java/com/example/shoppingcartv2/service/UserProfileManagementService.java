package com.example.shoppingcartv2.service;

import com.example.shoppingcartv2.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserProfileManagementService {
    List<User> getAllUser();
    User getUserById(Integer id);
    User updateUser(User user,Integer id);
    void deleteUser(Integer id);
}
