package com.nttdata.product.microservice.mapper;

import com.nttdata.product.microservice.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toModel(com.nttdata.product.microservice.domain.Product product);
    com.nttdata.product.microservice.domain.Product toDocument(Product product);
}