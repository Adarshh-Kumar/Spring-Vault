package com.banking.accountservice.dto;

import com.banking.accountservice.entity.AccountType;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public class CreateAccountRequest {
    @NotBlank(message = "Account holder name required")
    private String accountHolderName;


    @NotBlank(message = "Email is required")
    @Email(message="Email format is invalid")
    private String email;


    @NotBlank(message = "Phone number is required")
    private String phone;

    @NotNull(message="Account Type is required")
    private AccountType accountType;

    @NotNull(message="initial depsoit is required")
    @Positive(message="initial deposit must be positive")
    private BigDecimal initialDeposit;

}
