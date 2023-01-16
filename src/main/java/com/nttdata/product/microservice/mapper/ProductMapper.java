package com.nttdata.product.microservice.mapper;

import com.nttdata.product.microservice.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toModel(com.nttdata.product.microservice.domain.Product product);
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Product toModelWithoutDate(com.nttdata.product.microservice.domain.Product product);
    com.nttdata.product.microservice.domain.Product toDocument(Product product);
}