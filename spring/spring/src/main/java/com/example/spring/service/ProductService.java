package com.example.spring.service;

import java.util.List;

import com.example.spring.entity.Product;

public interface ProductService {
    public List<Product> getAllProducts();
    public Product getProductsById(int productId);
    public void updateProduct(int productId, Product product);
    public Boolean deleteProduct(int productId);
    public void createProduct(Product product);
    
}
