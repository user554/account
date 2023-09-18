package com.aws.eks.account.controller.impl;

import com.aws.eks.account.controller.AccountController;
import com.aws.eks.account.model.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/account")
@RestController
@Slf4j
public class AccountControllerImpl implements AccountController {
    @Override
    @GetMapping("/{accountNUmber}")
    public Account getAccount(Long accountNUmber) {
        log.info("Received request to read account details for accountNumber={}", accountNUmber);
        return AccountController.super.getAccount(accountNUmber);
    }
}
