package org.example.productservice.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequest {
    private String name;
    private BigDecimal price;
}
