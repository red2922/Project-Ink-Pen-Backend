package com.jake.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.jake.demo.Repository.OrderRepository;
import com.jake.demo.dto.Order;

public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order saveNewOrder(Order order) {
        return orderRepository.save(order);
    }

}
