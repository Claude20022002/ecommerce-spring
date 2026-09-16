package ma.claude.ecommercespring.dto.mapper;

import ma.claude.ecommercespring.dto.request.CategoryRequest;
import ma.claude.ecommercespring.dto.response.CategoryResponse;
import ma.claude.ecommercespring.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface CategoryMapper {

    @Mapping(target = "products", ignore = true)
    Category toEntity(CategoryRequest request);

    CategoryResponse toResponse(Category category);

    List<CategoryResponse> toResponseList(List<Category> categories);
}
