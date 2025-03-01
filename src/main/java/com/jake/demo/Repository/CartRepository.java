package com.jake.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jake.demo.dto.Cart;

public interface CartRepository extends MongoRepository<Cart, Integer> {

}
