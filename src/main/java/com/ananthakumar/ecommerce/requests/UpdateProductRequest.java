package com.ananthakumar.ecommerce.requests;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpdateProductRequest {
    private String name;

    private String brand;

    private BigDecimal price;

    private int quantity;

    private String description;

    private Long categoryId;
}
