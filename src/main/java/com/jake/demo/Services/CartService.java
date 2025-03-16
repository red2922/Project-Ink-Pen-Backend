package com.jake.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jake.demo.Repository.CartRepository;
import com.jake.demo.dto.Cart;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Optional<Cart> getCartById(Integer id) {
        return cartRepository.findById(id);
    }

    @Transactional
    public void processCart() {
        //Process cart will first check if the cart exists. If null create a new cart otherwise
        //go through every cart for an account. First subtracts the money from the current account. Then gives them to reflect both the posts and posters accounts. 
    }

}
