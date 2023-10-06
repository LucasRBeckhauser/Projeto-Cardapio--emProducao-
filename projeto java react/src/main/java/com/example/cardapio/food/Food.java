package com.example.cardapio.food;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "food")
@Entity(name = "food")
public class Food {
    private Long id;
    private String title;
    private String image;

}
