package com.example.buildart.mappers;

import com.example.buildart.dto.CategoryDto;
import com.example.buildart.models.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper implements EntityMapper<Category, CategoryDto> {
    @Override
    public Category toEntity(CategoryDto dto) {
        Category category = new Category();
        category.setName(dto.getName());
        category.setDescription(dto.getDescription());
        return category;
    }

    @Override
    public CategoryDto toDto(Category entity) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName(entity.getName());
        categoryDto.setDescription(entity.getDescription());
        return categoryDto;
    }
}
