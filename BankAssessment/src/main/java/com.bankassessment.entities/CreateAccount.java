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
public class CreateAccount {
private int createAccount_id;
private String accountName;
private String accountPassword;
private double initialDeposit;
    //@OneToMany
    private String accountNumber;

    public CreateAccount() {
    }

    public CreateAccount(int createAccount_id, String accountName, String accountPassword, double initialDeposit, String accountNumber) {
        this.createAccount_id = createAccount_id;
        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.initialDeposit = initialDeposit;
        this.accountNumber = accountNumber;
    }

    public int getCreateAccount_id() {
        return createAccount_id;
    }

    public void setCreateAccount_id(int createAccount_id) {
        this.createAccount_id = createAccount_id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
