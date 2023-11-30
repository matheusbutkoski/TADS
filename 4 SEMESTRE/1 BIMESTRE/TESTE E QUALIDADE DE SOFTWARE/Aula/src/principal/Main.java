package principal;

import controle.CadastroAluno;
import javax.persistence.EntityManager;
import modelo.Aluno;
import persistencia.ConexaoBD;
import persistencia.DaoAluno;
import util.Input;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = -1;
        while (op != 0) {
            System.out.println("Digite 1 para cadastrar aluno");
            System.out.println("Digite 2 para editar aluno");
            System.out.println("Digite 3 para listar alunos");
            System.out.println("Digite 0 para sair");
            op = Input.nextInt();
            
            switch (op) {
                case 1:
                    CadastroAluno.cadastrar();
                    break;
                case 2:
                    System.out.println("digite o ra do aluno");
                    String ra = Input.next();
                    CadastroAluno.editar(CadastroAluno.pesquisar(ra));
                    break;
                case 3:
                    CadastroAluno.listar();
                default:

            }
        }

    }

}
