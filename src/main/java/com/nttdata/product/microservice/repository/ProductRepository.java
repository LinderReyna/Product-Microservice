package com.nttdata.product.microservice.repository;

import com.nttdata.product.microservice.domain.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.Collection;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
    Flux<Product> findAllByBankAccount_NameIn(Collection<String> account_name);
}