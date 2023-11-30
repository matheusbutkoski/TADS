package controle;

import modelo.ContratoVenda;
import util.Input;

public class CadastroContratoVenda extends CadastroContrato {

    public static ContratoVenda cadastrar() {
        ContratoVenda contr = new ContratoVenda();
        setarInformacoes(contr);
        contratos.add(contr);
        return contr;
    }

    public static ContratoVenda editar(ContratoVenda contr) {
        setarInformacoes(contr);
        return contr;
    }

    public static void setarInformacoes(ContratoVenda contr) {
        CadastroContrato.setarInformacoes(contr);

        System.out.print("Forma de pagamento: ");
        contr.setFormaPagamento(Input.next());

        System.out.print("Parcelas: ");
        contr.setQtdParcelas(Input.nextInt());
    }

   
}
