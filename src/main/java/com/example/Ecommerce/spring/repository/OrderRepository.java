package com.example.Ecommerce.spring.repository;

import com.example.Ecommerce.spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
