package com.springcloudmicroservice.accountservice.api;

import com.springcloudmicroservice.accountservice.entity.Account;
import com.springcloudmicroservice.accountservice.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
public class AccountApi {

    public ResponseEntity<Account> get(String id){

    }
    public ResponseEntity<Account> save(Account account){

    }
    public ResponseEntity<Account> update(Account account){

    }
    public void delete(String id){

    }
    public ResponseEntity<Account> pagination(){

    }



}
