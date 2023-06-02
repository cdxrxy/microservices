package org.example.orderservice.mapper;

import javax.annotation.processing.Generated;
import org.example.orderservice.dto.OrderDto;
import org.example.orderservice.model.Order;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-02T18:41:07+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class OrderMapperImpl implements OrderMapper {

    private final OrderItemListMapper orderItemListMapper = OrderItemListMapper.INSTANCE;

    @Override
    public Order orderDtoToOrder(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( orderDto.getId() );
        order.setOrderItems( orderItemListMapper.orderItemDtoListToOrderItemList( orderDto.getOrderItems() ) );

        return order;
    }
}
