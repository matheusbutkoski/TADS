package principal;

import controle.ControlePessoa;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import modelo.Pessoa;
import persistencia.ConexaoBD;
import util.excecoes.ExceptionCadastroPessoa;

/**
 *
 * @author ANDRE.LUCHESI
 */
public class AulaValidacao {

    public static void main(String[] args) {
        // TODO code application logic here
        ConexaoBD.getConection();        
        ControlePessoa controlP = new ControlePessoa();
        
    }

}
