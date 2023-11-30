package util.validacoes;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.TYPE_USE,
    ElementType.ANNOTATION_TYPE,
    ElementType.PARAMETER,
    ElementType.FIELD
})
@Constraint(validatedBy = ValidatorCPF.class)
public @interface CPF {

    
    String message() default "CPF invalido!";
    
   
    Class<?>[] groups() default {};
    
    
    Class<? extends Payload>[] payload() default {};
}
