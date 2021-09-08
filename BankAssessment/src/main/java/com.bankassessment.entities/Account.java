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
public class Account {
private int account_id;
private int responseCode;
private boolean success;
private String message;

    public Account() {
    }

    public Account(int account_id, int responseCode, boolean success, String message) {
        this.account_id = account_id;
        this.responseCode = responseCode;
        this.success = success;
        this.message = message;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
