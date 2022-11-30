package com.nttdata.product.microservice.controller;

import com.nttdata.product.microservice.model.Product;

import java.math.BigDecimal;

public class ProductBuilder {
    public static Product getDto() {
        Product dto = new Product();
        dto.setId("636dd894a3da3a2e59d90ad2");
        dto.setType(Product.TypeEnum.PASIVOS);
        dto.setName("Ahorro");
        dto.setDescription("cuentas bancarias");
        return dto;
    }
}
