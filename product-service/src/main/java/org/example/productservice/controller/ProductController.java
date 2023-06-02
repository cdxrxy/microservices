package org.example.productservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.productservice.dto.ProductDto;
import org.example.productservice.mapper.ProductListMapper;
import org.example.productservice.mapper.ProductMapper;
import org.example.productservice.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(CREATED)
    public void createProduct(@RequestBody ProductDto productDto) {
        productService.createProduct(
                ProductMapper.INSTANCE
                        .productDtoToProduct(productDto)
        );
    }

    @GetMapping
    @ResponseStatus(OK)
    public List<ProductDto> getAllProducts() {
        return ProductListMapper.INSTANCE
                .productListToProductDtoList(
                        productService.getAllProducts()
                );
    }
}
