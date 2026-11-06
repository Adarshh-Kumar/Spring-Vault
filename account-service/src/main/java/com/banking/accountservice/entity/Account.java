package com.banking.accountservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)

    private String id;
    private String accountNumber;
    private String accountHolderName;
    private String email;
    private String phone;

    @Enumerated(EnumType.STRING)

    private AccountType accountType;
    private AccountStatus status;
    private BigDecimal balance;
    private BigDecimal dailyTransactionLimit;
    private LocalDateTime createdAt;



}
