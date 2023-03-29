package org.example.productservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.productservice.dto.request.ProductRequest;
import org.example.productservice.dto.response.ProductResponse;
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
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}
