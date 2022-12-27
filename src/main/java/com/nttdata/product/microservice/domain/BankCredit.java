package com.nttdata.product.microservice.domain;

import lombok.Data;

@Data
public class BankCredit {
    private String creditCard;
    private Integer numberOfCredits;
}
