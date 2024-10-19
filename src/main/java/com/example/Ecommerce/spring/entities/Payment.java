package com.example.Ecommerce.spring.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Payment{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private double amount;
    private String status;
}
