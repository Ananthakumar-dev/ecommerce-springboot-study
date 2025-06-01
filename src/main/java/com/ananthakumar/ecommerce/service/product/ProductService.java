package com.ananthakumar.ecommerce.service.product;

import com.ananthakumar.ecommerce.model.Product;
import com.ananthakumar.ecommerce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements ProductInterface {
    private final ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException("product Not Found"));
    }

    @Override
    public Product updateProduct(Product product, Long productId) {
        return null;
    }

    @Override
    public void deleteProductById(Long productId) {

    }

    @Override
    public List<Product> getProductByCategory(Long categoryId) {
        return productRepository.findByCategory(categoryId);
    }

    @Override
    public List<Product> getProductByBrand(String name) {
        return productRepository.findByBrand(name);
    }

    @Override
    public List<Product> getProductByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> getProductByNameAndCategory(String name, Long categoryId) {
        return productRepository.findByNameAndCategory();
    }

    @Override
    public List<Product> getProductByCategoryName(String name) {
        return productRepository.findByCategoryName();
    }

    @Override
    public Long countProductByName(String name) {
        return productRepository.countByName();
    }
}
