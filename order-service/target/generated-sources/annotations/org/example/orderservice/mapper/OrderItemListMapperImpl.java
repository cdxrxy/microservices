package org.example.orderservice.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.orderservice.dto.OrderItemDto;
import org.example.orderservice.model.OrderItem;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-02T20:07:31+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class OrderItemListMapperImpl implements OrderItemListMapper {

    private final OrderItemMapper orderItemMapper = OrderItemMapper.INSTANCE;

    @Override
    public List<OrderItem> orderItemDtoListToOrderItemList(List<OrderItemDto> orderItemDtoList) {
        if ( orderItemDtoList == null ) {
            return null;
        }

        List<OrderItem> list = new ArrayList<OrderItem>( orderItemDtoList.size() );
        for ( OrderItemDto orderItemDto : orderItemDtoList ) {
            list.add( orderItemMapper.orderItemDtoToOrderItem( orderItemDto ) );
        }

        return list;
    }
}
