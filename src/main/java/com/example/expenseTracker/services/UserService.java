//package com.example.expenseTracker.services;
//
//import com.example.expenseTracker.entities.User;
//import com.example.expenseTracker.repositories.UserRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//@Slf4j
//public class UserService {
//
//    @Autowired
//    UserRepository userRepository;
//
//    public User addUser(String userName, String email, String password) {
//        User user = new User(userName, email, password);
//
//        return userRepository.save(user);
//    }
//}
