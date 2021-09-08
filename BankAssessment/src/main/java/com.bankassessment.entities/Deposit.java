/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bankassessment.entities;

/**
 *
 * @author user
 */
public class Deposit {
private int deposit_id;
private String accountNumber;
private double amount;
private String account;

    public Deposit() {
    }

    public Deposit(int deposit_id, String accountNumber, double amount, String account) {
        this.deposit_id = deposit_id;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.account = account;
    }

    public Deposit(int deposit_id, String accountNumber, double amount) {
        this.deposit_id = deposit_id;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public int getDeposit_id() {
        return deposit_id;
    }

    public void setDeposit_id(int deposit_id) {
        this.deposit_id = deposit_id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
