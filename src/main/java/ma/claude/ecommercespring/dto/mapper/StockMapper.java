package ma.claude.ecommercespring.dto.mapper;

import ma.claude.ecommercespring.dto.request.StockRequest;
import ma.claude.ecommercespring.dto.response.StockResponse;
import ma.claude.ecommercespring.model.Stock;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface StockMapper {

    @Mapping(target = "product", ignore = true)
    Stock toEntity(StockRequest request);

    StockResponse toResponse(Stock stock);
}
