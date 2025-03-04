package com.jake.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jake.demo.dto.Order;

public interface OrderRepository extends MongoRepository<Order, Integer> {

}
