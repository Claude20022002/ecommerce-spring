package ma.claude.ecommercespring.dto.request;

import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductRequest {

    @NotBlank(message = "Product name is required")
    @Size(min = 3, max = 100)
    private String name;

    private String description;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be positive")
    private BigDecimal price;

    @NotNull(message = "Category ID is required")
    private Long categoryId;

    @Min(0)
    private Integer initialStock;
}
