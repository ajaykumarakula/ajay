package com.example.demo.exem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Product {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long productId;
private String productName;
private Integer quantity;
private Integer price;


public Product() {
	super();
}
public Product(Long productId, String productName, Integer quantity, Integer price) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.quantity = quantity;
	this.price = price;
}
public Long getProductId() {
	return productId;
}
public void setProductId(Long productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity + ", price="
			+ price + ", getProductId()=" + getProductId() + ", getProductName()=" + getProductName()
			+ ", getQuantity()=" + getQuantity() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
