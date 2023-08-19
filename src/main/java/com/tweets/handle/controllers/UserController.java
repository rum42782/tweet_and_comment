package com.tweets.handle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweets.handle.model.user;
import com.tweets.handle.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("users")
    public user saveUser(@RequestBody user user) {
        return userService.createUser(user);
    }

    @GetMapping("allUsers")
    public List<user> listAll() {
        return userService.listAll();
    }

    @GetMapping("")
    public static String getString() {
        return "URL not found";
    }

    @GetMapping("users/id/{id}")
    public user getUserId(@PathVariable Integer id) {
        return userService.getUserId(id);
    }

    @GetMapping("users/username/{username}")
    public user findByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable Integer id) {
        userService.deleteUser(id);
    }

}    
