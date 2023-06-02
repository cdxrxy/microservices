package org.example.orderservice.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.RequiredArgsConstructor;
import org.example.orderservice.dto.OrderDto;
import org.example.orderservice.mapper.OrderMapper;
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
    public void createOrder(@RequestBody OrderDto orderDto) {
        orderService.createOrder(
                OrderMapper.INSTANCE
                        .orderDtoToOrder(orderDto)
        );
    }

    public void fallback(OrderDto request, RuntimeException e) {
        throw e;
    }
}
