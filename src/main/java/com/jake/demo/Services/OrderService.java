package com.jake.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jake.demo.Repository.OrderRepository;
import com.jake.demo.dto.Order;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order saveNewOrder(Order order) {
        return orderRepository.save(order);
    }

}
