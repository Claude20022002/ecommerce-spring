package ma.claude.ecommercespring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotBlank(message = "Le nom du produit est obligatoire")
    @Size(min = 3, max = 100, message = "Il est obligatoire de fournir plus de 3 caractères")
    private String name;

    @Size(max = 1000, message = "La description ne peut pas excéder 1000 caractères")
    private String description;

    @NotNull(message = "Le prix est obligatoire")
    @Positive(message = "Le prix ne peut pas être négative")
    @Digits(integer = 10, fraction = 2, message = "Format du prix est invalide")
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitialize", "handler"})
    private Category category;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private Stock stock;
}
