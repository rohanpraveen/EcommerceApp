package com.example.Ecommerce.spring.repository;

import com.example.Ecommerce.spring.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
