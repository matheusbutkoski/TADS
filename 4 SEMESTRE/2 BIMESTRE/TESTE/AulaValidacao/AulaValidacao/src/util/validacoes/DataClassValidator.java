package util.validacoes;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class DataClassValidator implements ConstraintValidator<DataClass, Object> {
    /**
     * A classe de validação implementa ConstraintValidator e precisa sobrescrever o método isValid, 
     * que o método que vai considerar se o valor recebido através do parâmetro value é valido ou não.
     * @param value propriedade que recebe o valor do atributo.
     * @param context
     * @return 
     */
  @Override
  public boolean isValid(Object value, ConstraintValidatorContext context) {
    return value != null;
  }
}
