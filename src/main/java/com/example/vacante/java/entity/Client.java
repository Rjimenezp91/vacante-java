package com.example.vacante.java.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "name")
    private String name;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "account")
    private int account;

    @Column(name = "historic")
    private BigDecimal historic;

    @Column(name = "is_active")
    private Boolean isActive;

    public Client(String name, BigDecimal balance, int account, BigDecimal historic, Boolean isActive) {
        this.name = name;
        this.balance = balance;
        this.account = account;
        this.historic = historic;
        this.isActive = isActive;
    }
    public Client(){}

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public BigDecimal getHistoric() {
        return historic;
    }

    public void setHistoric(BigDecimal historic) {
        this.historic = historic;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
