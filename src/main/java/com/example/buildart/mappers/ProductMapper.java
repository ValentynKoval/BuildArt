package com.example.buildart.mappers;

import com.example.buildart.dto.ProductDto;
import com.example.buildart.models.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper implements EntityMapper<Product, ProductDto> {
    @Override
    public Product toEntity(ProductDto dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setStock_quantity(dto.getStock_quantity());
        product.setCategory(dto.getCategory());
        return product;
    }

    @Override
    public ProductDto toDto(Product entity) {
        ProductDto productDto = new ProductDto();
        productDto.setName(entity.getName());
        productDto.setDescription(entity.getDescription());
        productDto.setPrice(entity.getPrice());
        productDto.setStock_quantity(entity.getStock_quantity());
        productDto.setCategory(entity.getCategory());
        return productDto;
    }
}
