package org.example.orderservice.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GeneralResponse {
    private String message;
}
