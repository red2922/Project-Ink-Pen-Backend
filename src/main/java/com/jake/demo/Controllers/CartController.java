package com.jake.demo.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jake.demo.Services.CartService;
import com.jake.demo.dto.Cart;

@RestController
@RequestMapping("/api")
public class CartController {
    @Autowired
    private CartService cartService;

    Optional<Cart> getCartById(int id) {
        return cartService.getCartById(id);
    }

}
