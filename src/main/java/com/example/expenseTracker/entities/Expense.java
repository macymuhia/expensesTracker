package com.example.expenseTracker.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Setter
@Getter
@Table(name = "expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rent")
    private double rent;

    @Column(name = "elec_units")
    private int electricityUnits;

    @Column(name = "bill_status")
    private boolean billStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User userId;

    public Expense(){}

    public Expense (double rent, int electricityUnits, boolean billStatus, User userId) {
        this.rent = rent;
        this.electricityUnits = electricityUnits;
        this.billStatus = billStatus;
        this.userId = userId;
    }

    public User getUserId() {
        return userId;
    }
}
