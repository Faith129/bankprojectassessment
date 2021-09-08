/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bankassessment.entities;

import java.util.Date;

/**
 *
 * @author user
 */
public class AccountStatement {
private int accountStatement_id;
private Date transactionDate;
private String transactionType;
private String narration;
private double amount;
private double accountBalance;

    public AccountStatement() {
    }

    public AccountStatement(int accountStatement_id, Date transactionDate, String transactionType, String narration, double amount, double accountBalance) {
        this.accountStatement_id = accountStatement_id;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.narration = narration;
        this.amount = amount;
        this.accountBalance = accountBalance;
    }

    public int getAccountStatement_id() {
        return accountStatement_id;
    }

    public void setAccountStatement_id(int accountStatement_id) {
        this.accountStatement_id = accountStatement_id;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
