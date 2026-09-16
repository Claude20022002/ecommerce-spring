package ma.claude.ecommercespring.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class StockResponse {

    private Long id;
    private Integer quantity;
    private LocalDateTime lastUpdated;
}
