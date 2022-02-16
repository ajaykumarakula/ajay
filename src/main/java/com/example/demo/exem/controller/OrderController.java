package com.example.demo.exem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exem.dto.OrderRequest;
import com.example.demo.exem.entity.Customer;
import com.example.demo.exem.repository.CustomerRepository;
import com.example.demo.exem.repository.ProductRepository;

@RestController
@RequestMapping("/user")
public class OrderController {
@Autowired
private CustomerRepository customerRepository;
@Autowired
private ProductRepository productRepository;
@PostMapping("/SAVE")
public Customer placeOrder(@RequestBody OrderRequest request) {
	return customerRepository.save(request.getCustomer());
}
}
