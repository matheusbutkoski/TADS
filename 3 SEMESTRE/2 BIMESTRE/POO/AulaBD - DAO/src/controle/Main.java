package controle;

import modelo.Pessoa;
import persistencia.DaoPessoa;
import persistencia.DatabaseConnection;
import util.Input;

public class Main {

    private static DaoPessoa daoPessoa = new DaoPessoa();
    
    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseConnection.getConnection();
        
        listarPessoas();
        cadastrarPessoa();
        
        System.out.println("\n");
        listarPessoas();

    }
    
    public static void listarPessoas(){
        System.out.println("\nLista de Pessoas");
        for (Pessoa pessoa : daoPessoa.carregarPessoas()) {
            System.out.println(""+pessoa.toString());
        }
    }
    
    public static void cadastrarPessoa(){
        Pessoa p = new Pessoa();
        System.out.println("Qual o seu nome: ");
        p.setNome(Input.nextLine());
        System.out.println("cpf: ");
        p.setCpf(Input.next());
        System.out.println("telefone: ");
        p.setTelefone(Input.next());
        p.setEndereco(null);
        
        daoPessoa.salvar(p);
    }

}
