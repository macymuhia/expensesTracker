package com.example.expenseTracker.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class LoginRequest {

    @NotNull
    private String userName;

    @NotNull
    private String password;

    public LoginRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
