package com.jake.demo.Services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jake.demo.Repository.CartRepository;
import com.jake.demo.dto.Cart;
import com.jake.demo.dto.Order;

@Service
public class CartService {

    private CartRepository cartRepository;
    private CustomerService customerService;
    private PostsService postsService;

    public CartService(CartRepository cartRepository, CustomerService customerService, PostsService postsService) {
        this.cartRepository = cartRepository;
        this.customerService = customerService;
        this.postsService = postsService;
    }

    public Optional<Cart> getCartById(Integer id) {
        return cartRepository.findById(id);
    }

    @Transactional
    public void processCart(Cart cart) {
        for (Order order : cart.getTips()) {
            customerService.changeBalance(cart.getUserId(), -order.getTip());
            customerService.changeBalance(order.getPost().getUserId(), order.getTip());
            postsService.updatePostBalance(order.getPost().getId(), order.getTip());
        }
    }

}
