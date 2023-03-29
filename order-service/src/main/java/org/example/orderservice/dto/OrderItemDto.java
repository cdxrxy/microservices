package org.example.orderservice.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDto {
    private Long productId;
    private BigDecimal price;
    private Integer quantity;
}