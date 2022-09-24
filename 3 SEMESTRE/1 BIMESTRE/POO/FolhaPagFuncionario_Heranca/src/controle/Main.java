package controle;

import modelo.Horista;
import modelo.Mensalista;
import modelo.Comissionado;
import modelo.Funcionario;
import modelo.Endereco;
import util.Input;
import util.DateUtils;
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Funcionario f1 = new Mensalista(2000, 200, "12563", DateUtils.createLocalDate(5, 3, 2021), "Professora", "Natalia", "1111", DateUtils.createLocalDate(5, 1, 2000), new Endereco("Cascavel", 120, "Tito Muffato"));
        Funcionario f2 = new Comissionado(0.05, 1200, 220, "9568586", DateUtils.createLocalDate(15, 5, 2022), "Vendedor", "Bia", "2222", DateUtils.createLocalDate(20, 4, 2002), new Endereco("Cascavel", 1200, "Parana"));
        Funcionario f3 = new Horista( 25, "9759225", DateUtils.createLocalDate(11, 9, 2021), "Motorista", "Marcos", "3456", DateUtils.createLocalDate(2, 9, 2003), new Endereco("Cascavel", 180, "Carlos Gomes"));
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        
        int op;
        do {
            System.out.println("");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Editar Funcionário");
            System.out.println("3 - Remover Funcionário");
            System.out.println("4 - Listar Funcionários");
            System.out.println("5 - Folha de pagamento do mês");
            op = Input.nextInt();

            switch (op) {
                case 1 : 
                    Funcionario p = CadastroFuncionario.cadastrar();
                    funcionarios.add(p);
                    break;
                
                case 2 : {
                    Funcionario funcEditar = CadastroFuncionario.pesquisarFuncionario(funcionarios);
                    CadastroFuncionario.editar(funcEditar);
                    break;
                }
                case 3 :
                    CadastroFuncionario.removerFuncionario(funcionarios);
                    break;
                case 4 :
                    CadastroFuncionario.listar(funcionarios);
                    break;
                case 5 :  
                    CadastroFuncionario.folhaPagamentoMes(funcionarios);
                    break;
            }

        } while (op != 0);
    }

}
