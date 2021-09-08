/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bankassessment.repository;

import com.bankassessment.entities.CreateAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class CreateAccountRepository {
    private static Map<Integer, CreateAccount> createAccountMap = new HashMap<>();
    private static int createAccount_id;

    static {
        CreateAccount createInfo1 = new CreateAccount(1 , "John", "1234", 9000.00, "04948474748");
        CreateAccount createaccount = new CreateAccount(2, "paul", "5558504211", 8000.00, "394484030");
        createAccountMap.put(1, createInfo1);
        createAccountMap.put(2,createaccount);

    }

    //public static list<CreateAccount> getAllAccountInfo(){

     //   return new ArrayList<>(createAccountMap.values());
    //}
     static String getAccountNumber(int j)
     {
         String CreateAccountNumber =  "0123456789";

         StringBuilder a = new StringBuilder(j);

         for (int i = 0; i < j; i++) {

             int index = (int)(CreateAccountNumber.length() * Math.random());
             a.append(CreateAccountNumber.charAt(index));
         }
         return a.toString();
     }
     static  int j = 10;


    public static CreateAccount addNewAccount(CreateAccount createAccountMap){
        createAccount_id += 1;
        createAccountMap.setCreateAccount_id(createAccount_id);
        createAccountMap.setAccountName(createAccountMap.getAccountName());
        createAccountMap.setAccountPassword(createAccountMap.getAccountPassword());
        createAccountMap.setInitialDeposit(createAccountMap.getInitialDeposit());
        createAccountMap.setAccountNumber(createAccountMap.getAccountNumber());
        createAccountMap.setAccountNumber(CreateAccountRepository.getAccountNumber(j));
        return createAccountMap;
    }
    //list account details
    public static CreateAccount getAccountDetails(int createAccount_id){
        return createAccountMap.get(createAccount_id);
    }

    public static CreateAccount updateAccount(String  accountNumber, CreateAccount createAccountMap){

        createAccountMap.setCreateAccount_id(createAccount_id);
        createAccountMap.setAccountName(createAccountMap.getAccountName());
        createAccountMap.setAccountPassword(createAccountMap.getAccountPassword());
        createAccountMap.setInitialDeposit(createAccountMap.getInitialDeposit());
        return createAccountMap;
    }

}
