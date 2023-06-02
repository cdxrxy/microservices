package org.example.inventoryservice.mapper;

import org.example.inventoryservice.dto.InventoryDto;
import org.example.inventoryservice.model.Inventory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InventoryMapper {
    InventoryMapper INSTANCE = Mappers.getMapper(InventoryMapper.class);

    Inventory inventoryDtoToInventory(InventoryDto inventoryDto);
    InventoryDto inventoryToInventoryDto(Inventory inventory);
}
