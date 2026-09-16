package ma.claude.ecommercespring.util;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ValidationException;
import jakarta.validation.Validator;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ValidationUtil {
    private final Validator validator;
    public ValidationUtil(Validator validator) {
        this.validator = validator;
    }
    public <T> void validate(T object) {
        Set<ConstraintViolation<T>> violations =
                validator.validate(object);
        if (!violations.isEmpty()) {
            throw new ValidationException(
                    violations.stream()
                            .map(ConstraintViolation::getMessage)
                            .collect(Collectors.joining(", "))
            );
        }
    }
}
