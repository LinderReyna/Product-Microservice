package com.nttdata.product.microservice.service;

import com.nttdata.product.microservice.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    Mono<Product> save(Mono<Product> product);
    Mono<Void> deleteById(String id);
    Mono<Product> findById(String id);
    Flux<Product> findAll();
    Mono<Product> update(Mono<Product> product, String id);
}
