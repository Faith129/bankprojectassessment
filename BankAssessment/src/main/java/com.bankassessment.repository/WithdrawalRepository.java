/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bankassessment.repository;

import com.bankassessment.entities.Deposit;
import com.bankassessment.entities.Withdrawal;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class WithdrawalRepository {

    private static List<Withdrawal> mapWithdraw = new ArrayList<>();

    public static double withdrawAmount;
    public static double balance;

    public Withdrawal withdrawAmount(Withdrawal withdraw) {

        if (withdrawAmount <= 500 || withdrawAmount > balance) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Insufficient Amount");
        } else {
            if (withdrawAmount < 1) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Withdrawal amount must be a positive value");
            } else {
                balance = balance - withdrawAmount;
                return withdraw;

            }
        }
    }

    }
