package com.sg.shoppingcart.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

@Repository
public class CartRepository {
    
    @Autowired
    @Qualifier("redislab")
    private RedisTemplate<String, String> redisTemplate;

    public Optional<String> get(String id) {
        ValueOperations<String, String> valueOp = redisTemplate.opsForValue();
        String value = valueOp.get(id);
        
        if (null == value)
            return Optional.empty(); 
        return Optional.of(value); 
    }
    
}
