package com.nttdata.product.microservice.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
@Builder
public class BankCredit {
    @Indexed(unique = true, sparse = true)
    private String creditCard;
    private Integer numberOfCredits;
}
