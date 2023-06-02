package org.example.productservice.mapper;

import org.example.productservice.dto.ProductDto;
import org.example.productservice.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = ProductMapper.class)
public interface ProductListMapper {
    ProductListMapper INSTANCE = Mappers.getMapper(ProductListMapper.class);

    List<ProductDto> productListToProductDtoList(List<Product> productList);
}
