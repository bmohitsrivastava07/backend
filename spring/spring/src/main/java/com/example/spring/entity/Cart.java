package com.example.spring.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true,name="cart_id")
    private int cartId;
	
	@Column 
    private int cartSize;
    
	@Column
    private int totalItems;
    
    @OneToMany(mappedBy="cart" )
    private List<Product> product=new ArrayList();
    
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int cartId, int cartSize, int totalItems) {
		super();
		this.cartId = cartId;
		this.cartSize = cartSize;
		this.totalItems = totalItems;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getCartSize() {
		return cartSize;
	}
	public void setCartSize(int cartSize) {
		this.cartSize = cartSize;
	}
	public int getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
	public List<Product> getProducts() {
		return product;
	}
	public void addProducts(Product product) {
		this.product.add(product);
	}
	
	public void removeProducts(Product product) {
		this.product.remove(product);
	}
	
	
    
}
