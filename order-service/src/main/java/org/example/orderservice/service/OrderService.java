package org.example.orderservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.inventory.InventoryRequest;
import org.example.inventory.InventoryServiceGrpc;
import org.example.orderservice.exception.NotInStockException;
import org.example.orderservice.model.Order;
import org.example.orderservice.model.OrderItem;
import org.example.orderservice.repository.OrderRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
    private final OrderRepo orderRepo;
    @GrpcClient("inventory")
    private InventoryServiceGrpc.InventoryServiceBlockingStub inventoryStub;

    @Transactional
    public void createOrder(Order order) {
        List<Long> productIds = order.getOrderItems().stream().map(OrderItem::getProductId).toList();

        InventoryRequest request = InventoryRequest.newBuilder().addAllProductId(productIds).build();
        Boolean allInStock = inventoryStub.inventory(request).getAllInStock();

        if (Boolean.FALSE.equals(allInStock)) {
            throw new NotInStockException("Product is not in stock, please try again later");
        }

        orderRepo.save(order);

        log.info("Order with id {} is saved", order.getId());
    }
}
