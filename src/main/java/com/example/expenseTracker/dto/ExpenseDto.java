package com.example.expenseTracker.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExpenseDto {
    private double rent;
    private int electricityUnits;
    private boolean billStatus;
    private Long userId;
}
