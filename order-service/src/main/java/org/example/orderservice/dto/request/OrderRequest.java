package org.example.orderservice.dto.request;

import lombok.Data;
import org.example.orderservice.dto.OrderItemDto;

import java.util.List;

@Data
public class OrderRequest {
    private List<OrderItemDto> orderItemDtoList;
}
