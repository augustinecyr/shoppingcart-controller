package com.sg.shoppingcart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.shoppingcart.repositories.CartRepository;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepo;

    
}
