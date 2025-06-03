package com.ananthakumar.ecommerce.service.product;

import com.ananthakumar.ecommerce.exception.NotFoundException;
import com.ananthakumar.ecommerce.model.Category;
import com.ananthakumar.ecommerce.model.Product;
import com.ananthakumar.ecommerce.repository.CategoryRepository;
import com.ananthakumar.ecommerce.repository.ProductRepository;
import com.ananthakumar.ecommerce.requests.AddProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements ProductInterface {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public Product addProduct(AddProductRequest request) {

        Category category = categoryRepository.findById(request.getCategoryId()).orElseThrow(() -> new NotFoundException("Category Not Found"));
        Product product = storeProduct(request, category);
        productRepository.save(product);

        return product;
    }

    private Product storeProduct(
            AddProductRequest request,
            Category category
    )
    {
        return new Product(
            request.getName(),
            request.getBrand(),
            request.getPrice(),
            request.getQuantity(),
            request.getDescription(),
                category
        );
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId).orElseThrow(() -> new NotFoundException("product Not Found"));
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
