package com.aws.eks.account.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Account {
    private Long accountNumber;
    private String status;
    private Double balance;
}
