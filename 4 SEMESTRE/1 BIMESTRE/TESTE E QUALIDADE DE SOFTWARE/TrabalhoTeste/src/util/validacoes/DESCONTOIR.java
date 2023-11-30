
package util.validacoes;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {DescontoIRValidator.class})
@ReportAsSingleViolation
public @interface DESCONTOIR {
    String message() default "O valor deve ser 0, 7.5, 15, 22.5 ou 27.5";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
