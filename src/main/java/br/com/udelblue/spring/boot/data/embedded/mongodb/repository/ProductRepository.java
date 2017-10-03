package br.com.udelblue.spring.boot.data.embedded.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.udelblue.spring.boot.data.embedded.mongodb.domain.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
