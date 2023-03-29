package org.example.productservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.productservice.dto.request.ProductRequest;
import org.example.productservice.dto.response.ProductResponse;
import org.example.productservice.exception.EmptyProductSetException;
import org.example.productservice.exception.ProductAlreadyExistsException;
import org.example.productservice.model.Product;
import org.example.productservice.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepo productRepo;

    public void createProduct(ProductRequest productRequest) {
        if(productRepo.existsByName(productRequest.getName())) {
            throw new ProductAlreadyExistsException("Product with that name already exists");
        }

        Product product = Product.builder()
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .build();

        productRepo.save(product);

        log.info("Product with id {} is saved", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> result = productRepo.findAll();
        if(result.isEmpty()) {
            throw new EmptyProductSetException("There is no products");
        }

        return result.stream().map(this::convertToProductResponse).toList();
    }

    private ProductResponse convertToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }
}
