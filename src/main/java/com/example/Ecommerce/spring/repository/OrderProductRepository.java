package com.example.Ecommerce.spring.repository;

import com.example.Ecommerce.spring.entities.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
}
