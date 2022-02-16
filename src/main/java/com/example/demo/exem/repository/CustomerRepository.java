package com.example.demo.exem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.exem.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
