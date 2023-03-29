package org.example.inventoryservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.inventoryservice.dto.request.InventoryRequest;
import org.example.inventoryservice.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/inventories")
public class InventoryController {
    private final InventoryService inventoryService;

    @PostMapping
    @ResponseStatus(CREATED)
    public void createInventory(@RequestBody InventoryRequest inventoryRequest) {
        inventoryService.createInventory(inventoryRequest);
    }

    @GetMapping
    @ResponseStatus(OK)
    public boolean getAllInStock(@RequestParam(name = "product-id") List<Long> productIds) {
        return inventoryService.allInStock(productIds);
    }
}
