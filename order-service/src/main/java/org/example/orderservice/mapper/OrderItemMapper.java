package org.example.orderservice.mapper;

import org.example.orderservice.dto.OrderItemDto;
import org.example.orderservice.model.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderItemMapper {
    OrderItemMapper INSTANCE = Mappers.getMapper(OrderItemMapper.class);

    OrderItem orderItemDtoToOrderItem(OrderItemDto orderItemDto);
}
