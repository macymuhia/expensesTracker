//package com.example.expenseTracker.services;
//
//import com.example.expenseTracker.dto.ExpenseDto;
//import com.example.expenseTracker.entities.Expense;
//import com.example.expenseTracker.entities.User;
//import com.example.expenseTracker.repositories.ExpenseRepository;
//import com.example.expenseTracker.repositories.UserRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@Slf4j
//public class ExpenseService {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    ExpenseRepository expenseRepository;
//
//    public Expense addExpense(ExpenseDto expenseDto) {
//        Expense expense = new Expense();
//
//        Long userId = expenseDto.getUserId();
//        Optional<User> userObj = userRepository.findById(userId);
//        User user = userObj.get();
//
//        expense.setRent(expenseDto.getRent());
//        expense.setElectricityUnits(expenseDto.getElectricityUnits());
//        expense.setBillStatus(expenseDto.isBillStatus());
//        expense.setUserId(user);
//
//        return expenseRepository.save(expense);
//    }
//
////    public Expense addExpense(double rent, int electricityUnits, boolean billStatus, Long userId) {
////        log.info("get user id : {}",userId);
////        User myUser = userRepository.getOne(userId);
////
////        Expense expense = new Expense(rent, electricityUnits, billStatus, myUser);
////        log.info("user_id ======> {}", expense.getUser());
////        return expenseRepository.save(expense);
////    }
//}
