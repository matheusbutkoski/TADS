package principal;

import controle.ControlePessoa;
import persistencia.ConexaoBD;
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
