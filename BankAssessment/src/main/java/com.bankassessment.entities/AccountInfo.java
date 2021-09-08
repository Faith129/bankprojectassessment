package com.bankassessment.entities;

public class AccountInfo {
    private int accountInfo_id;
    private String accountName;
    private String accountNumber;
    private double balance;
    private String account;

    public AccountInfo() {
    }


    public AccountInfo(int accountInfo_id, String accountName, String accountNumber, double balance, String account) {
        this.accountInfo_id = accountInfo_id;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.account = account;
    }

    public AccountInfo(int accountInfo_id, String accountName, String accountNumber, double balance) {
        this.accountInfo_id = accountInfo_id;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountInfo_id() {
        return accountInfo_id;
    }

    public void setAccountInfo_id(int accountInfo_id) {
        this.accountInfo_id = accountInfo_id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }


}
