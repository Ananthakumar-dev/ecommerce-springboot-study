package com.ananthakumar.ecommerce.repository;

import com.ananthakumar.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(Long categoryId);

    List<Product> findByBrand(String name);

    List<Product> findByName(String name);

    List<Product> findByNameAndCategory();

    List<Product> findByCategoryName();

    Long countByName();
}
