package com.tweets.handle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweets.handle.model.user;
import com.tweets.handle.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public user createUser(user user) {
        return userRepo.save(user);
    }

    public List<user> listAll() {
        return userRepo.findAll();
    }

    public user getUserId(Integer id) {
        return userRepo.findById(id).get();
    }

    public user updateUsername(Integer id, String username) {
        user user = userRepo.findById(id).orElse(null);
        if (user != null) {
            user.setUsername(username);
            return userRepo.save(user);
        }
        return null;
    }

    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }

    public user findByUsername(String username) {
        return userRepo.findByUsername(username);
    } 
    
        public user getUserById(Integer userId) {
        return userRepo.findById(userId).get();
    }
}

