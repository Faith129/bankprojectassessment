/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bankassessment.repository;

import com.bankassessment.entities.Deposit;
import com.bankassessment.entities.Users;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class DepositRepository {
    private static Map<Integer, Deposit> depositMap = new HashMap<>();
    private static int deposit_id;

    private static List<Deposit> mapDeposit = new ArrayList<>();


    static {
        Deposit deposit = new Deposit(1 , "faith", 5000);
        Deposit depos = new Deposit(2, "84746470292", 2000);
        depositMap.put(1, deposit);
        depositMap.put(2,depos);

    }

    public static double amount;
    public static double balance;

    public Deposit depositCash(Deposit deposit) {
        double newBalance = balance + amount;
        if (amount >= 1000000)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Account cannot accept such amount");
        else {
            if (amount < 1) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Account cannot accept such amount");

            } else
        mapDeposit.add(deposit);
        return deposit;
    }
    }}

   /* public void DepositAmount(double amount, double balance) throws Exception {
            Deposit deposit = new Deposit();

            double newBalance = balance + amount;

            if (amount >= 1000000)
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Account cannot accept such amount");


            else {
                if (amount < 1) {
                    System.out.println("bad request");
                } else

                    //   balance += amount;

                    System.out.println("#" + amount + " has been deposited.");

            }


        } catch (Exception ex) {

        }}


    */


