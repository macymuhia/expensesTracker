package com.example.expenseTracker.controllers;

import com.example.expenseTracker.entities.User;
import com.example.expenseTracker.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

//    @PostMapping(path = "/add")
//    public @ResponseBody User addNewUser(@RequestBody User user) {
//        log.info("user: >>>>" + user.getFirstName());
//
//        return userService.addUser(user.getFirstName(), user.getLastName(), user.getUserName(), user.getGender());
//
//    }

    @GetMapping(path = "/list")
    public @ResponseBody List<User> getUsers() {
        return userRepository.findAll();
    }

}
