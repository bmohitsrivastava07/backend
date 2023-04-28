package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entity.Product;

public interface ProductRepository extends JpaRepository<Product , Integer> {
        
}
