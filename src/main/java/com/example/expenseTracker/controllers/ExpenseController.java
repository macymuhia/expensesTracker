//package com.example.expenseTracker.controllers;
//
//import com.example.expenseTracker.entities.Expense;
//import com.example.expenseTracker.dto.ExpenseDto;
//import com.example.expenseTracker.repositories.ExpenseRepository;
//import com.example.expenseTracker.services.ExpenseService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Slf4j
//@Controller
//@RequestMapping(path = "/expense")
//public class ExpenseController {
//    @Autowired
//    ExpenseRepository expenseRepository;
//
//    @Autowired
//    ExpenseService expenseService;
//
//    @GetMapping(path = "/list")
//    public @ResponseBody List<Expense> getExpenses() {
////        List<Expense> expenses = expenseRepository.findAll();
////        Map<String, Object> expenseItems = new HashMap<>();
////        for (Expense exp: expenses) {
////            expenseItems.put("id", exp.getId());
////            expenseItems.put("rent", exp.getRent());
////            expenseItems.put("electricityUnits", exp.getElectricityUnits());
////            expenseItems.put("billStatus", exp.isBillStatus());
////        }
////        log.info("expenseitems: " + expenseItems);
//        return expenseRepository.findAll();
//    }
//
//    @PostMapping(path = "/add")
//    public @ResponseBody Expense addExpense(@RequestBody ExpenseDto expenseDto) {
//        return expenseService.addExpense(expenseDto);
//    }
//}
