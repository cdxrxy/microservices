package org.example.orderservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    @JsonProperty(access = READ_ONLY)
    private Long id;
    private List<OrderItemDto> orderItems;
}
