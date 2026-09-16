package ma.claude.ecommercespring.dto.mapper;

import ma.claude.ecommercespring.dto.request.ProductRequest;
import ma.claude.ecommercespring.dto.response.ProductResponse;
import ma.claude.ecommercespring.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mapping(target = "category", ignore = true)
    @Mapping(target = "stock", ignore = true)
    Product toEntity(ProductRequest request);

    ProductResponse toResponse(Product product);
    List<ProductResponse> toResponseList(List<Product> products);
}
