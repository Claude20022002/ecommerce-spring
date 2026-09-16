package ma.claude.ecommercespring.service;

import lombok.extern.slf4j.Slf4j;
import ma.claude.ecommercespring.dto.mapper.ProductMapper;
import ma.claude.ecommercespring.dto.request.ProductRequest;
import ma.claude.ecommercespring.dto.response.ProductResponse;
import ma.claude.ecommercespring.model.Product;
import ma.claude.ecommercespring.util.ValidationUtil;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductService {
    private final ValidationUtil validationUtil;
    private final ProductMapper productMapper;

    public ProductService(ValidationUtil validationUtil, ProductMapper productMapper) {
        this.validationUtil = validationUtil;
        this.productMapper = productMapper;
    }

    public ProductResponse createProduct(ProductRequest request) {
        log.debug("Creating product with request: {}", request);
        validationUtil.validate(request);
        Product product = productMapper.toEntity(request);
// ... logique métier
        return productMapper.toResponse(product);
    }
}
