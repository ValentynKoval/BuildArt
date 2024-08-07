package com.example.buildart.services;

import com.example.buildart.dto.CategoryDto;
import com.example.buildart.mappers.CategoryMapper;
import com.example.buildart.repo.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CategoryService {
    private CategoryRepository categoryRepository;
    private CategoryMapper categoryMapper;

    public void save(CategoryDto categoryDto) {
        categoryRepository.save(categoryMapper.toEntity(categoryDto));
    }

    public CategoryDto getCategory(Long id) {
        return categoryMapper.toDto(categoryRepository.findById(id).orElseThrow());
    }

    public List<CategoryDto> getAllCategories() {
        return categoryRepository.findAll().stream().map(category -> categoryMapper.toDto(category)).collect(Collectors.toList());
    }
}
