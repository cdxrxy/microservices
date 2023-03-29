package org.example.orderservice.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.RequiredArgsConstructor;
import org.example.orderservice.dto.request.OrderRequest;
import org.example.orderservice.dto.response.GeneralResponse;
import org.example.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(CREATED)
    @CircuitBreaker(name = "inventory", fallbackMethod = "fallback")
    @Retry(name = "inventory")
    public GeneralResponse createOrder(@RequestBody OrderRequest orderRequest) {
        orderService.createOrder(orderRequest);
        return GeneralResponse.builder().message("Order Successfully created").build();
    }

    public GeneralResponse fallback(OrderRequest request, RuntimeException e) {
        throw e;
    }
}
