package com.nttdata.product.microservice.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Account {
    private BigDecimal maintenance;
    private Integer movement;
    private List<Integer> fixedDay;
}
