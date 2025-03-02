package com.jake.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jake.demo.Repository.CartRepository;
import com.jake.demo.dto.Cart;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Optional<Cart> getCartById(Integer id) {
        return cartRepository.findById(id);
    }

}
