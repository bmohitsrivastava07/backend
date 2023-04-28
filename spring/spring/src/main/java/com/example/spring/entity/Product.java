package com.example.spring.entity;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false,unique=true)
	private int productId;
	
	@Lob	
	@Column(nullable=false)
	private byte[] productImage;
	
	@Column(nullable=false)
	private String productName;
	
	@Column(nullable=false)
	private String productDescription;
	
	@Column
	private String productStatus;
	
	@Column(nullable=false)
	private int productPrice;
	
	@Column(nullable=false)
	private int productQuantity;
	
	@ManyToOne
	private Cart cart;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productId, byte[] productImage, String productName, String productDescription,
			String productStatus, int productPrice, int productQuantity) {
		super();
		this.productId = productId;
		this.productImage = productImage;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productStatus = productStatus;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public byte[] getProductImage() {
		return productImage;
	}
	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	
}
