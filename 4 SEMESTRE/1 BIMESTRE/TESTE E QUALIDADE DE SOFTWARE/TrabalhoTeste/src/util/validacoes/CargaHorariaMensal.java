package util.validacoes;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidatorCargaHorariaMensal.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CargaHorariaMensal {
    String message() default "Carga horária inválida.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
