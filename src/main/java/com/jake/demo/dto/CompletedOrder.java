package com.jake.demo.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "completedOrders")
public class CompletedOrder extends Order {

    public CompletedOrder(Integer id, Integer userId, Post post, float tip) {
        super(id, userId, post, tip);
    }

}
