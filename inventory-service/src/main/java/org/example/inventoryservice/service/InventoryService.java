package org.example.inventoryservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.inventoryservice.exception.InventoryAlreadyExistsException;
import org.example.inventoryservice.model.Inventory;
import org.example.inventoryservice.repository.InventoryRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {
    private final InventoryRepo inventoryRepo;

    @Transactional
    public void createInventory(Inventory inventory) {
        if (inventoryRepo.existsByProductId(inventory.getProductId())) {
            throw new InventoryAlreadyExistsException("Inventory for this product already exists");
        }

        inventoryRepo.save(inventory);

        log.info("Inventory with id {} is saved", inventory.getId());
    }

    @Transactional(readOnly = true)
    public boolean allInStock(List<Long> productIds) {
        List<Inventory> result = inventoryRepo.findByProductIdIn(productIds);
        if (result.isEmpty() || productIds.size() != result.size()) {
            return false;
        }

        return result.stream().allMatch(inventory -> inventory.getQuantity() > 0);
    }
}