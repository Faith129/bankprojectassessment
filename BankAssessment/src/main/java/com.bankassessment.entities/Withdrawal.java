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
public class Withdrawal {
private int withdrawal_id;
private String accountNumber;
private String accountPassword;
private double withdrawAmount;
private String account;

    public Withdrawal() {
    }

    public Withdrawal(int withdrawal_id, String accountNumber, String accountPassword, double withdrawAmount, String account) {
        this.withdrawal_id = withdrawal_id;
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
        this.withdrawAmount = withdrawAmount;
        this.account = account;
    }

    public int getWithdrawal_id() {
        return withdrawal_id;
    }

    public void setWithdrawal_id(int withdrawal_id) {
        this.withdrawal_id = withdrawal_id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
