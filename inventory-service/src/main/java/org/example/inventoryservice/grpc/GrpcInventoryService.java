package org.example.inventoryservice.grpc;

import io.grpc.stub.StreamObserver;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.inventory.InventoryRequest;
import org.example.inventory.InventoryResponse;
import org.example.inventory.InventoryServiceGrpc;
import org.example.inventoryservice.service.InventoryService;

@GrpcService
@RequiredArgsConstructor
public class GrpcInventoryService extends InventoryServiceGrpc.InventoryServiceImplBase {
    private final InventoryService inventoryService;

    @Override
    public void inventory(InventoryRequest request, StreamObserver<InventoryResponse> responseObserver) {
        boolean allInStock = inventoryService.allInStock(request.getProductIdList());

        InventoryResponse response = InventoryResponse
                .newBuilder()
                .setAllInStock(allInStock)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
