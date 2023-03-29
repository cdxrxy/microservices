package org.example.inventoryservice.repository;

import org.example.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Long> {
    boolean existsByProductId(Long productId);
    List<Inventory> findByProductIdIn(List<Long> productIds);
}
