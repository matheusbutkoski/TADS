/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.validacoes;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DescontoINSSValidator implements ConstraintValidator<DESCONTOINSS, Double> {
    @Override
    public void initialize(DESCONTOINSS constraintAnnotation) {
    }

    @Override
    public boolean isValid(Double value, ConstraintValidatorContext context) {
        return value == 7.5 || value == 9 || value == 12 || value == 14;
    }
}
