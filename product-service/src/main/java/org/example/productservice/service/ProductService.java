package org.example.productservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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

    public void createProduct(Product product) {
        if(productRepo.existsByName(product.getName())) {
            throw new ProductAlreadyExistsException("Product with that name already exists");
        }

        productRepo.save(product);

        log.info("Product with id {} is saved", product.getId());
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
}
