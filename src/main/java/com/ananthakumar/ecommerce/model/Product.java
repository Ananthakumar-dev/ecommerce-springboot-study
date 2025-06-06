package com.ananthakumar.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String brand;

    private BigDecimal price;

    private int quantity;

    private String description;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "category_id"
    )
    private Category category;

    @OneToMany(
            mappedBy = "product",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Image> images;


    public Product(String name, String brand, BigDecimal price, int quantity, String description, Category category) {
    }
}
