package org.example.orderservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.orderservice.dto.OrderItemDto;
import org.example.orderservice.dto.request.OrderRequest;
import org.example.orderservice.exception.NotInStockException;
import org.example.orderservice.model.Order;
import org.example.orderservice.model.OrderItem;
import org.example.orderservice.repository.OrderRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class OrderService {
    private final OrderRepo orderRepo;
    private final WebClient.Builder webClientBuilder;

    public void createOrder(OrderRequest orderRequest) {
        List<Long> productIds = orderRequest.getOrderItemDtoList().stream().map(OrderItemDto::getProductId).toList();
        Boolean allInStock = webClientBuilder.build().get()
                .uri("http://inventory-service/api/inventories",
                        uriBuilder -> uriBuilder.queryParam("product-id", productIds).build())
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();

        if(Boolean.FALSE.equals(allInStock)) {
            throw new NotInStockException("Product is not in stock, please try again later");
        }

        List<OrderItem> orderItemList = orderRequest.getOrderItemDtoList().stream().map(this::convertToOrderItem).toList();

        Order order = Order.builder().orderItems(orderItemList).build();

        orderRepo.save(order);

        log.info("Order with id {} is saved", order.getId());
    }

    private OrderItem convertToOrderItem(OrderItemDto orderItemDto) {
        return OrderItem.builder()
                .productId(orderItemDto.getProductId())
                .price(orderItemDto.getPrice())
                .quantity(orderItemDto.getQuantity())
                .build();
    }
}
