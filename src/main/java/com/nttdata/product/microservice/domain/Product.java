package com.nttdata.product.microservice.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@Document
public class Product {
    @Id
    private String id;
    private String type;
    @Indexed(unique = true)
    private String name;
    private String description;
    private BigDecimal maintenance;
    private Integer movement;
    private BigDecimal credit;
    @CreatedDate
    private OffsetDateTime createdAt;
}
