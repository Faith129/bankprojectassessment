/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bankassessment.repository;

import com.bankassessment.entities.CreateAccount;
import com.bankassessment.entities.Users;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class UsersRepository {
    private static Map<Integer, Users> userMap = new HashMap<>();
    private static int user_id;

    static {
        Users userInfo = new Users(1, "joy","9848494033", "1234");
        Users userinforma = new Users(2, "Emma","74594048373", "12343");
        userMap.put(1, userInfo);
        userMap.put(2,userinforma);

    }

    public static Users getUsers(int user_id){
        return userMap.get(user_id);
    }
    public static Users addUser(Users userMap){
        userMap.setUser_id(userMap.getUser_id());
        userMap.setAccountName(userMap.getAccountName());
        userMap.setAccountNumber(userMap.getAccountNumber());
        userMap.setAccountPassword(userMap.getAccountPassword());
        userMap.setBalance(userMap.getBalance());

        return userMap;


        /*user_id += 1;
        userMap.setUser_id(user_id);
        userMap.put(user_id, userMap);
        return userMap;*/
    }

    public static Users updateUser(String  accountNumber, Users userMap){

        userMap.setUser_id(user_id);
        userMap.setAccountName(userMap.getAccountName());
        userMap.setAccountNumber(userMap.getAccountNumber());
        userMap.setAccountPassword(userMap.getAccountPassword());
        userMap.setBalance(userMap.getBalance());

        return userMap;
    }


}
