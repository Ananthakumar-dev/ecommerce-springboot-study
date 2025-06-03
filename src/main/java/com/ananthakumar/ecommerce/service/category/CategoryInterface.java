package com.ananthakumar.ecommerce.service.category;

import com.ananthakumar.ecommerce.model.Category;

import java.util.List;

public interface CategoryInterface {
    List<Category> getAllCategories();

    Category addCategory(Category category);

    Category updateCategory(Category category, Long id);

    Category findCategoryById(Long id);

    Category findCategoryByName(String name);

    void deleteCategoryById(Long id);
}
