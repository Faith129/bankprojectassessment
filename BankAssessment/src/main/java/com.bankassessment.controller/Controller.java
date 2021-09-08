/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bankassessment.controller;

import com.bankassessment.AccountInfoServiceImplement;
import com.bankassessment.entities.AccountInfo;
import com.bankassessment.entities.CreateAccount;
import com.bankassessment.entities.Deposit;
import com.bankassessment.entities.Users;
import com.bankassessment.repository.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.omg.CORBA.portable.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author user
 */
@RestController
@RequestMapping( "/api/v1" )

public class Controller {
    @Autowired
    private DepositRepository depositRepository;

    @GetMapping("/accountInfo")
   public List<AccountInfo> getAllAccountInfo(){
        return AccountInfoRepository.getAllAccountInfo();
    }

    @GetMapping(path = "/accountInfo/{accountInfo_id}")
    public AccountInfo getAccountDetails(@PathVariable String accountNumber){
        return AccountInfoRepository.getAccountDetails(accountNumber);

    }

    @PostMapping(path = "/createAccount")
    public CreateAccount addNewAccount (@RequestBody CreateAccount createAccountMap){
        return CreateAccountRepository.addNewAccount(createAccountMap);
    }

    @PutMapping(path = "/updateAccount/{accountInfo_id}")
    public CreateAccount updateAccount(@PathVariable String accountNumber, @RequestBody CreateAccount createAccountMap){
        return CreateAccountRepository.updateAccount(accountNumber, createAccountMap);
    }

    @PostMapping(path = "/adduser")
    public Users addUser (@RequestBody Users userMap){
        return UsersRepository.addUser(userMap);
    }

    @PutMapping(path = "/updateUser/{accountNumber}")
    public Users updateUser(@PathVariable String accountNumber, @RequestBody Users userMap){
        return UsersRepository.updateUser(accountNumber, userMap);
    }



    @PostMapping("/deposit")
    public Deposit Createdeposit ( @RequestBody Deposit deposit) {

        return depositRepository.depositCash(deposit);

    }



}

   /* @PostMapping("/deposit")
    public ResponseEntity DepositAmount(@RequestBody String response) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Deposit deposit = objectMapper.readValue(response, new TypeReference<Deposit>() {
        });
        System.out.println("deposit"+deposit);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //return (depositRepository.DepositAmount.(response)) ? new ResponseEntity(deposit, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    return RequestBody.ok();
    }




   // @GetMapping("/deposit")
    //public List<Deposit> retrieveAllDeposit() {
      //  return d.findAll();
    //}



}
*/