package com.nttdata.product.microservice.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Credit {
    private String creditCard;
    private BigDecimal membership;
}
