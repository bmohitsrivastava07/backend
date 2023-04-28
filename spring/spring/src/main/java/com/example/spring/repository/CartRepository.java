package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

}
