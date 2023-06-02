package org.example.orderservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.orderservice.exception.NotInStockException;
import org.example.orderservice.model.Order;
import org.example.orderservice.model.OrderItem;
import org.example.orderservice.repository.OrderRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
    private final OrderRepo orderRepo;
    private final WebClient.Builder webClientBuilder;

    @Transactional
    public void createOrder(Order order) {
        List<Long> productIds = order.getOrderItems().stream().map(OrderItem::getProductId).toList();
        Boolean allInStock = webClientBuilder.build().get()
                .uri("http://inventory-service/api/inventories",
                        uriBuilder -> uriBuilder.queryParam("product-id", productIds).build())
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();

        if (Boolean.FALSE.equals(allInStock)) {
            throw new NotInStockException("Product is not in stock, please try again later");
        }

        orderRepo.save(order);

        log.info("Order with id {} is saved", order.getId());
    }
}
