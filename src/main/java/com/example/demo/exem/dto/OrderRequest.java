package com.example.demo.exem.dto;

import com.example.demo.exem.entity.Customer;

public class OrderRequest {
private Customer customer;


public OrderRequest() {
	super();
}


public OrderRequest(Customer customer) {
	super();
	this.customer = customer;
}


public Customer getCustomer() {
	return customer;
}


public void setCustomer(Customer customer) {
	this.customer = customer;
}


@Override
public String toString() {
	return "OrderRequest [customer=" + customer + ", getCustomer()=" + getCustomer() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
