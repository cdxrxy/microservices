package org.example.orderservice.mapper;

import org.example.orderservice.dto.OrderItemDto;
import org.example.orderservice.model.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = OrderItemMapper.class)
public interface OrderItemListMapper {
    OrderItemListMapper INSTANCE = Mappers.getMapper(OrderItemListMapper.class);

    List<OrderItem> orderItemDtoListToOrderItemList(List<OrderItemDto> orderItemDtoList);
}
