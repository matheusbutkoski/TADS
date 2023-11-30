
package principal;

import controle.CadastroAluno;
import controle.CadastroCurso;
import persistencia.ConexaoBD;
import util.Input;

/**
 *
 * @author andre.luchesi
 */
public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        ConexaoBD.getConnection();
        
        int op = -1;
        while (op != 0) {
            System.out.println("Menu");
            System.out.println("1 - Cadastro de Alunos");
            System.out.println("2 - Cadastro de Cursos");
            System.out.println("3 - Cadastro de Disciplinas");
            System.out.println("0 - sair");
            op = Input.nextInt();
            switch (op) {
                case 1:
                    cadastroDeAlunos();
                    break;
                case 2:
                    cadastroDeCursos();
                    break;
                case 3:
                    break;
               
                default:
                    System.out.println("\nopção inválida!");
            }
        }
    }
    
    public static void cadastroDeAlunos() {
        int op = -1;
        while (op != 0) {
            System.out.println("");
            System.out.println("1 - Cadastrar ");
            System.out.println("2 - Editar ");
            System.out.println("3 - Remover ");
            System.out.println("4 - Listar ");
            System.out.println("0 - voltar");
            op = Input.nextInt();
            String raPesquisa = null;
            switch (op) {
                case 1:
                    CadastroAluno.cadastrar();
                    break;
                case 2:
                    System.out.println("informe o RA: ");
                    raPesquisa = Input.next();
                    CadastroAluno.editar(CadastroAluno.pesquisar(raPesquisa));
                    break;
                case 3:
                    System.out.println("informe o RA: ");
                    raPesquisa = Input.next();
                    CadastroAluno.remover(CadastroAluno.pesquisar(raPesquisa));
                    break;
                case 4:
                    CadastroAluno.listar();
                    break;
                default:
                    System.out.println("\nopção inválida!");
            }
        }
    }

    public static void cadastroDeCursos() {
        int op = -1;
        while (op != 0) {
            System.out.println("");
            System.out.println("1 - Cadastrar ");
            System.out.println("2 - Editar ");
            System.out.println("3 - Remover ");
            System.out.println("4 - Listar ");
            System.out.println("0 - voltar");
            op = Input.nextInt();
            int idPesquisa = 0;
            switch (op) {
                case 1:
                    CadastroCurso.cadastrar();
                    break;
                case 2:
                    System.out.println("informe o Id do curso: ");
                    idPesquisa = Input.nextInt();
                    CadastroCurso.editar(CadastroCurso.pesquisar(idPesquisa));
                    break;
                case 3:
                    System.out.println("informe o Id do curso: ");
                    idPesquisa = Input.nextInt();
                    CadastroCurso.remover(CadastroCurso.pesquisar(idPesquisa));
                    break;
                case 4:
                    CadastroCurso.listar();
                    break;
                default:
                    System.out.println("\nopção inválida!");
            }
        }
    }
    
}
