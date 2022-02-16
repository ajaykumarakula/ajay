package com.example.demo.exem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.exem.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
