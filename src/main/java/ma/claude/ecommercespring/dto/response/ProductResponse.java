package ma.claude.ecommercespring.dto.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class ProductResponse {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private CategoryResponse category;
    private StockResponse stock;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
