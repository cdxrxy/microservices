package org.example.inventoryservice.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InventoryResponse {
    private Long id;
    private Long productId;
    private Integer quantity;
}
