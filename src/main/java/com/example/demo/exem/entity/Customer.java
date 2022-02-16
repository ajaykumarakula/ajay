package com.example.demo.exem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity

public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long customerId;
	private String customerName;
	private String email;
	private String gender;
	
	@OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
	@JoinColumn(name="cp_fk",referencedColumnName = "customerId")
	private List<Product>products;
	

	public Customer() {
		super();
	}

	public Customer(Long customerId, String customerName, String email, String gender, List<Product> products) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.gender = gender;
		this.products = products;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
				+ ", gender=" + gender + ", products=" + products + ", getCustomerId()=" + getCustomerId()
				+ ", getCustomerName()=" + getCustomerName() + ", getEmail()=" + getEmail() + ", getGender()="
				+ getGender() + ", getProducts()=" + getProducts() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
