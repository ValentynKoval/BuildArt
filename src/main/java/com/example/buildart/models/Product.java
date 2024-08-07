package com.example.buildart.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private double price;
    private int stock_quantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
