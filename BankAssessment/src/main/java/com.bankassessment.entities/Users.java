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
public class Users {
private int user_id;
private String accountName;
private String accountNumber;
private String accountPassword;
private double balance;
private boolean success;
private String accessToken;

    public Users() {
    }

    public Users(int user_id, String accountName, String accountNumber, String accountPassword, double balance, boolean success, String accessToken) {
        this.user_id = user_id;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
        this.balance = balance;
        this.success = success;
        this.accessToken = accessToken;
    }

    public Users(int user_id, String accountName, String accountNumber, String accountPassword) {
        this.user_id = user_id;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
