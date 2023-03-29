package org.example.inventoryservice.dto.request;

import lombok.Data;

@Data
public class InventoryRequest {
    private Long productId;
    private Integer quantity;
}
