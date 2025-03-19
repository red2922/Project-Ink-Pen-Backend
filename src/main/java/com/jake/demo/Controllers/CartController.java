package com.jake.demo.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jake.demo.Services.CartService;
import com.jake.demo.dto.Cart;

@RestController
@RequestMapping("/api")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/cart/{id}")
    public Optional<Cart> getCartById(@PathVariable int id) {
        return cartService.getCartById(id);
    }

    @PostMapping("/cart/{id}")
    public void processCart(@RequestBody Cart cart){
        cartService.processCart(cart);
    }
}
