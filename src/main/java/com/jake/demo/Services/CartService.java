package com.jake.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jake.demo.Repository.CartRepository;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

}
