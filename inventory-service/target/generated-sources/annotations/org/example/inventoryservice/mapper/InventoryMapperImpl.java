package org.example.inventoryservice.mapper;

import javax.annotation.processing.Generated;
import org.example.inventoryservice.dto.InventoryDto;
import org.example.inventoryservice.model.Inventory;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-02T20:07:25+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class InventoryMapperImpl implements InventoryMapper {

    @Override
    public Inventory inventoryDtoToInventory(InventoryDto inventoryDto) {
        if ( inventoryDto == null ) {
            return null;
        }

        Inventory inventory = new Inventory();

        inventory.setId( inventoryDto.getId() );
        inventory.setProductId( inventoryDto.getProductId() );
        inventory.setQuantity( inventoryDto.getQuantity() );

        return inventory;
    }

    @Override
    public InventoryDto inventoryToInventoryDto(Inventory inventory) {
        if ( inventory == null ) {
            return null;
        }

        InventoryDto inventoryDto = new InventoryDto();

        inventoryDto.setId( inventory.getId() );
        inventoryDto.setProductId( inventory.getProductId() );
        inventoryDto.setQuantity( inventory.getQuantity() );

        return inventoryDto;
    }
}
