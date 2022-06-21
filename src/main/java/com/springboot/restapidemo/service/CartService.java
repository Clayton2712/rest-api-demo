package com.springboot.restapidemo.service;

import com.springboot.restapidemo.model.Cart;
import com.springboot.restapidemo.repository.CartRepository;
import com.springboot.restapidemo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CartService {
    private final CartRepository cartRepository;
    private final ItemRepository itemRepository;

    @Autowired
    public CartService(CartRepository cartRepository, ItemRepository itemRepository) {
        this.cartRepository = cartRepository;
        this.itemRepository = itemRepository;
    }

    //methods for CRUD operations
    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public List<Cart> getCarts() {
        return StreamSupport.stream(cartRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Cart getCart(Long id) {
        return cartRepository.findById(id).orElse(null);
    }

    public Cart deleteCart(Long id) {
        Cart cart = getCart(id);
        cartRepository.delete(cart);
        return cart;
    }

}
