/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bankassessment.repository;

import com.bankassessment.entities.AccountInfo;
import com.bankassessment.entities.CreateAccount;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
@Component
public class AccountInfoRepository {
    //private List<AccountInfo> list = new ArrayList<AccountInfo>();
    private static Map<Integer, AccountInfo> accountInfoMap = new HashMap<>();
    private static int accountInfo_id;

    static {
        AccountInfo accountinform = new AccountInfo(1 , "faith", "9843785910", 3000.00);
        AccountInfo accountinformation = new AccountInfo(2, "paul", "5558504211", 8000.00);
        accountInfoMap.put(1, accountinform);
        accountInfoMap.put(2,accountinformation);

    }

    public static List<AccountInfo> getAllAccountInfo(){
        return new ArrayList<>(accountInfoMap.values());
    }

    public static AccountInfo getAccountDetails(String accountNumber){
        return accountInfoMap.get(accountNumber);

    }



}
