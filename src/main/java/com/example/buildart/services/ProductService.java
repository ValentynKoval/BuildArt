package com.example.buildart.services;

import com.example.buildart.dto.ProductDto;
import com.example.buildart.mappers.ProductMapper;
import com.example.buildart.repo.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;
    private ProductMapper productMapper;

    public void save(ProductDto productDto) {
        productRepository.save(productMapper.toEntity(productDto));
    }

    public ProductDto getProduct(Long id) {
        return productMapper.toDto(productRepository.findById(id).orElseThrow());
    }

    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream().map(product -> productMapper.toDto(product)).collect(Collectors.toList());
    }
}
