package com.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Product;
import com.example.spring.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}

	@Override
	public Product getProductsById(int productId) {
		return this.productRepository.findById(productId).get();
	}

	@Override
	public void updateProduct(int productId,Product product) {
		if(this.productRepository.findById(productId).isPresent()) {
			this.productRepository.save(product);
		}
		else {
			this.productRepository.save(product);
			
		}		
	}

	@Override
	public Boolean deleteProduct(int productId) {
		this.productRepository.deleteById(productId);
		return true;
		
	}

	@Override
	public void createProduct(Product product) {
          productRepository.save(product);		
	}
     
}
