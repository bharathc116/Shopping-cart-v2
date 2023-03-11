package com.example.shoppingcartv2.serviceImpl;

import com.example.shoppingcartv2.model.User;
import com.example.shoppingcartv2.repository.UserRepo;
import com.example.shoppingcartv2.service.UserProfileManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileManagementServiceImpl implements UserProfileManagementService {
    @Autowired
    UserRepo userRepo;
    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userRepo.findById( id).orElseThrow(
                ()->new RuntimeException()
        );
    }

    @Override
    public User updateUser(User user, Integer id) {
User user1=userRepo.findById(id).orElseThrow(
        ()->new RuntimeException()
);
    user1.setAddress(user.getAddress());
    user1.setDob(user.getDob());
    user1.setEmail(user.getEmail());
    user1.setGender(user.getGender());
    user1.setAccountCreationDetails(user.getAccountCreationDetails());
    user1.setAccountStatus(user.getAccountStatus());
    user1.setLastLoginDate(user.getLastLoginDate());
    user1.setName(user.getName());
    user1.setPhoneNumber(user.getPhoneNumber());
    user1.setRole(user.getRole());
        return userRepo.save(user1);
    }

    @Override
    public void deleteUser(Integer id) {
User it=userRepo.findById(id).orElseThrow(
        ()->new RuntimeException()
);
userRepo.delete(it);

    }
}
