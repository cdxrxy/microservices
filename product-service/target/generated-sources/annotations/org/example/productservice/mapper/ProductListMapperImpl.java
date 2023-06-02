package org.example.productservice.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.productservice.dto.ProductDto;
import org.example.productservice.model.Product;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-02T18:41:57+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class ProductListMapperImpl implements ProductListMapper {

    private final ProductMapper productMapper = ProductMapper.INSTANCE;

    @Override
    public List<ProductDto> productListToProductDtoList(List<Product> productList) {
        if ( productList == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( productList.size() );
        for ( Product product : productList ) {
            list.add( productMapper.productToProductDto( product ) );
        }

        return list;
    }
}
