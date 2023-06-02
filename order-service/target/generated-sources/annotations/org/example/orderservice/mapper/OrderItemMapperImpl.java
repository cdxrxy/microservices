package org.example.orderservice.mapper;

import javax.annotation.processing.Generated;
import org.example.orderservice.dto.OrderItemDto;
import org.example.orderservice.model.OrderItem;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-02T20:07:31+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class OrderItemMapperImpl implements OrderItemMapper {

    @Override
    public OrderItem orderItemDtoToOrderItem(OrderItemDto orderItemDto) {
        if ( orderItemDto == null ) {
            return null;
        }

        OrderItem orderItem = new OrderItem();

        orderItem.setProductId( orderItemDto.getProductId() );
        orderItem.setPrice( orderItemDto.getPrice() );
        orderItem.setQuantity( orderItemDto.getQuantity() );

        return orderItem;
    }
}
