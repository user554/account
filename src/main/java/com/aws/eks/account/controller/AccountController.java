package com.aws.eks.account.controller;

import com.aws.eks.account.model.Account;
import org.springframework.web.bind.annotation.*;


public interface AccountController {

    default Account getAccount(@PathVariable(name="accountNUmber") Long accountNUmber){
        return Account.builder()
                .status("ACTIVE")
                .accountNumber(accountNUmber)
                .balance(879D)
                .build();
    }

}
