package util.validacoes;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalTime;

/**
 *
 * @author Peruzzo
 */
public class ValidatorCargaHorariaMensal implements ConstraintValidator<CargaHorariaMensal, LocalTime> {

    private static final int LIMITE_HORAS_MENSAL = 220;

    @Override
    public void initialize(CargaHorariaMensal constraintAnnotation) {
        // Método de inicialização do validador (pode ser deixado em branco)
    }

    @Override
    public boolean isValid(LocalTime value, ConstraintValidatorContext context) {
        return value == null || value.toString().isEmpty() || validaCargaHoraria(value);
    }

    private boolean validaCargaHoraria(LocalTime cargaHoraria) {

        int horas = cargaHoraria.getHour();
        int minutos = cargaHoraria.getMinute();
        int segundos = cargaHoraria.getSecond();

        int totalHoras = horas + (minutos / 60) + (segundos / 3600);

        return totalHoras <= LIMITE_HORAS_MENSAL;
    }
}
