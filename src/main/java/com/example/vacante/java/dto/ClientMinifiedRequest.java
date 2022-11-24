package com.example.vacante.java.dto;

import java.math.BigDecimal;

public class ClientMinifiedRequest {

    private Long id;
    private BigDecimal balance;

    public ClientMinifiedRequest() {
    }

    public ClientMinifiedRequest(Long id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
