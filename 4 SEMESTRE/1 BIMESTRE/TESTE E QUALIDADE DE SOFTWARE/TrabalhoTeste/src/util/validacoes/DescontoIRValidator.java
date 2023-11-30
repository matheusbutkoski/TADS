package util.validacoes;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DescontoIRValidator implements ConstraintValidator<DESCONTOIR, Double> {
    @Override
    public void initialize(DESCONTOIR constraintAnnotation) {
    }

    @Override
    public boolean isValid(Double value, ConstraintValidatorContext context) {
        return value == 0 || value == 7.5 || value == 15 || value == 22.5 || value == 27.5;
    }
}
