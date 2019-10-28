package com.fastcourier.courier.service;

import com.fastcourier.courier.model.Users;
import com.fastcourier.courier.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users addUser(Users user) {
        return userRepository.save(user);
    }

    public Users findUserById(Long userId) {
        return userRepository.findById(userId).get();
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

}
