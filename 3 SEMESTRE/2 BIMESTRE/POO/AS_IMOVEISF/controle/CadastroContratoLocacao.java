package controle;

import modelo.ContratoLocacao;
import util.Input;

public class CadastroContratoLocacao extends CadastroContrato {

    public static ContratoLocacao cadastrar() {
        ContratoLocacao contr = new ContratoLocacao();
        setarInformacoes(contr);
        contratos.add(contr);
        return contr;
    }

    public static ContratoLocacao editar(ContratoLocacao contr) {
        setarInformacoes(contr);
        return contr;
    }

    public static void setarInformacoes(ContratoLocacao contr) {
        CadastroContrato.setarInformacoes(contr);

        System.out.print("Data de início (ano-mês-dia): ");
        contr.setDataInicio(Input.nextLocalDate());

        System.out.print("Data de término (ano-mês-dia): ");
        contr.setDataTermino(Input.nextLocalDate());

        System.out.print("Percentual multa: ");
        contr.setPercentualMulta(Input.nextDouble());
    }

    
}
