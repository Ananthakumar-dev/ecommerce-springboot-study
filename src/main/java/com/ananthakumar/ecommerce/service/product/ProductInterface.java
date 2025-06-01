package com.ananthakumar.ecommerce.service.product;

import com.ananthakumar.ecommerce.model.Product;

import java.util.List;

public interface ProductInterface {
    Product addProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(Long productId);

    Product updateProduct(Product product, Long productId);

    void deleteProductById(Long productId);

    List<Product> getProductByCategory(Long categoryId);

    List<Product> getProductByBrand(String name);

    List<Product> getProductByName(String name);

    List<Product> getProductByNameAndCategory(String name, Long categoryId);

    List<Product> getProductByCategoryName(String name);

    Long countProductByName(String name);
}
