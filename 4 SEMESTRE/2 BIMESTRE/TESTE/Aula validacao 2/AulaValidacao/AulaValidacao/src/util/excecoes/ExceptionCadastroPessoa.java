package util.excecoes;

import java.util.Set;
import javax.validation.ConstraintViolation;
import modelo.Pessoa;

/**
 *
 * @author Andre
 */
public class ExceptionCadastroPessoa extends Exception {

    public ExceptionCadastroPessoa(String mensagem) {
         super(mensagem);
    }
    
    public ExceptionCadastroPessoa(String mensagem, Set<ConstraintViolation<Pessoa>> violations) {
         super(mensagem + getViolations(violations));
    }

    private static String getViolations(Set<ConstraintViolation<Pessoa>> violations) {
        String msg = "";
        if (violations == null || violations.isEmpty()) {
            return msg;
        }
        for (ConstraintViolation<Pessoa> violation : violations) {
            msg += "\n" + violation.getMessage();
        }
        return msg;
    }

}
