package com.example.Ecommerce.spring.repository;

import com.example.Ecommerce.spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
