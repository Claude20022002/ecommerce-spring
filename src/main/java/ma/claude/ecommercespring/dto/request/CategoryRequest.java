package ma.claude.ecommercespring.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryRequest {

    @NotBlank(message = "Category name is required")
    @Size(min = 3, max = 50, message = "Category name must be between 3 and 50 characters")
    private String name;

    private String description;
}
