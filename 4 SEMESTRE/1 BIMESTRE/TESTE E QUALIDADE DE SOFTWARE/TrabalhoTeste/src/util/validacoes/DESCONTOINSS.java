
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
@Constraint(validatedBy = {DescontoINSSValidator.class})
@ReportAsSingleViolation
public @interface DESCONTOINSS {
    String message() default "O valor deve ser 7.5, 9, 12 ou 14";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
