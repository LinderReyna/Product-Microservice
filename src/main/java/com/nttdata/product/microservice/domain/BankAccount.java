package com.nttdata.product.microservice.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

import java.math.BigDecimal;
import java.util.List;

@Data
public class BankAccount {
    @Indexed(unique = true)
    private String name;
    private BigDecimal maintenance;
    private Integer movement;
    private List<Integer> fixedDay;
}
