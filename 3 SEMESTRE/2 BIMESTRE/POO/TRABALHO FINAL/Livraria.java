import java.time.LocalDate;
import java.util.ArrayList;

import controle.CadastroCliente;
import controle.CadastroEmprestimo;
import controle.CadastroLivro;
import controle.CadastroVendedor;
import modelo.Cliente;
import modelo.Emprestimo;
import modelo.Livro;
import modelo.Vendedor;
import persistencia.DaoCliente;
import persistencia.DaoEmprestimo;
import persistencia.DaoLivro;
import persistencia.DaoVendedor;
import persistencia.DataBaseConnection;
import util.Input;

public class Livraria {
    private static DaoCliente daoCliente = new DaoCliente();
    private static DaoVendedor daoVendedor = new DaoVendedor();
    private static DaoLivro daoLivro = new DaoLivro();
    private static DaoEmprestimo daoEmprestimo = new DaoEmprestimo();
    public static void main(String[] args) {      
        DataBaseConnection.getConnection();
        int op = -1;
        int op2;
       while (op != 0) {
           System.out.println("=== MENU ===");
           System.out.println("1 - CRUD Clientes, Vendedores");
           System.out.println("2 - CRUD Livros");
           System.out.println("3 - CRUD Emprestimos");
           System.out.println("4 - Gerar Relatorios");
           System.out.println("5 - Realizar Devolucao");
           System.out.println("0 - Sair");
           op = Input.nextInt();
           switch (op) {
               case 1:
                   
                   System.out.println("Informe qual tipo deseja");                                    
                   System.out.println("1 - Cliente");                  
                   System.out.println("2 - Vendedor");
                   
                   op2 = Input.nextInt();
                       if(op2 == 1){
                           crudClientes();
                       }if(op2 == 2){
                           crudVendedores();               
                   break;
                    }
                case 2:        
                    crudLivro();                   
                    break;
                case 3:
                    crudEmprestimos();
                    break;
                case 4:
                    System.out.println("Informe qual tipo de relatorio deseja");
                    System.out.println("1 - Relatorio de Emprestimos");
                    System.out.println("2 - Relatorio de Livros");
                    System.out.println("3 - Relatorio de Clientes com emprestimo Pendente");
                    int op4 = Input.nextInt();
                    if (op4 == 1) {
                        listarEmprestimos();
                    }
                    if (op4 == 2) {
                        listarLivros();
                    }
                    if (op4 == 3) {
                        listarClientes();
                    }
                    break;
                case 5:
                    devolucao();
                    break;
                    
                    
                    
               default:
                   if(op != 0){ 
                       System.out.println("\nopção inválida!");
                   }
           }
       }
   
}

public static void crudClientes() {
    int op = -1; 
    while (op != 0) {
        System.out.println("");
        System.out.println("=== CRUD DE CLIENTES ===");
        System.out.println("1 - Cadastrar ");
        System.out.println("2 - Editar ");
        System.out.println("3 - Remover ");
        System.out.println("4 - Listar ");
        System.out.println("0 - Voltar");
        op = Input.nextInt();
        String cpfPesquisa = null;
        switch (op) {
            case 1:                            
                daoCliente.salvar(CadastroCliente.cadastrar());
                break;
            case 2:
                System.out.println("Informe o CPF: ");
                cpfPesquisa = Input.next();
                daoCliente.atualizar(CadastroCliente.editar(daoCliente.carregarPorCPF(cpfPesquisa)));
                break;
            case 3:
                System.out.println("Informe o CPF: ");
                cpfPesquisa = Input.next();
                daoCliente.remover(daoCliente.carregarPorCPF(cpfPesquisa));
                break;
            case 4:
            System.out.println("Informe o CPF: ");
            cpfPesquisa = Input.next();
            System.out.println("");
            Cliente cli = daoCliente.carregarPorCPF(cpfPesquisa);
            cli.exibirInformacoes();              
            break;                    
            default:
                if(op != 0){ 
                    System.out.println("\nOpção inválida!");
                }
        }
    }
}

public static void crudVendedores() {
    int op = -1;
    while (op != 0) {
        System.out.println("");
        System.out.println("=== CRUD DE VENDEDORES ===");
        System.out.println("1 - Cadastrar ");
        System.out.println("2 - Editar ");
        System.out.println("3 - Remover ");
        System.out.println("4 - Listar ");
        System.out.println("0 - Voltar");
        op = Input.nextInt();
        String cpfPesquisa = null;
        switch (op) {
            case 1:                          
                daoVendedor.salvar(CadastroVendedor.cadastrar());
                break;
            case 2:
                System.out.println("Informe o CPF: ");
                cpfPesquisa = Input.next();
                daoVendedor.atualizar(CadastroVendedor.editar(daoVendedor.carregarPorCPF(cpfPesquisa)));
                break;
            case 3:
                System.out.println("Informe o CPF: ");
                cpfPesquisa = Input.next();
                daoVendedor.remover(daoVendedor.carregarPorCPF(cpfPesquisa));
                break;
            case 4:
            System.out.println("Informe o CPF: ");
            cpfPesquisa = Input.next();
            System.out.println("");
            Vendedor ven = daoVendedor.carregarPorCPF(cpfPesquisa);
            ven.exibirInformacoes();              
            break;
            case 0:

            break;               
            default:
                if(op != 0){ 
                    System.out.println("\nOpção inválida!");
                }
        }
    }
}

public static void crudLivro() {
    int op = -1; 
    while (op != 0) {
        System.out.println("");
        System.out.println("=== CRUD DE LIVROS ===");
        System.out.println("1 - Cadastrar ");
        System.out.println("2 - Editar ");
        System.out.println("3 - Remover ");
        System.out.println("4 - Listar ");
        System.out.println("0 - Voltar");
        op = Input.nextInt();
        int idPesquisa = 0;
        switch (op) {
            case 1:                          
                daoLivro.salvar(CadastroLivro.cadastrar());
                break;
            case 2:
                System.out.println("Informe o ID do livro: ");
                idPesquisa = Input.nextInt();
                daoLivro.atualizar(CadastroLivro.editar(daoLivro.carregarPorID(idPesquisa)));
                break;
            case 3:
                System.out.println("Informe o ID do livro: ");
                idPesquisa = Input.nextInt();
                daoLivro.remover(daoLivro.carregarPorID(idPesquisa));
                break;
            case 4:
            System.out.println("Informe o ID do livro: ");
            idPesquisa = Input.nextInt();
            System.out.println("");
            Livro liv = daoLivro.carregarPorID(idPesquisa);
            liv.exibirInformacoes();              
            break;                    
            default:
                if(op != 0){ 
                    System.out.println("\nopção inválida!");
                }
        }
    }
}

public static void crudEmprestimos() {
    int op = -1;
    Emprestimo emp = null;
    while (op != 0) {
        System.out.println("");
        System.out.println("=== CRUD DE EMPRESTIMOS ===");
        System.out.println("1 - Cadastrar ");
        System.out.println("2 - Editar ");
        System.out.println("3 - Remover ");
        System.out.println("4 - Listar ");
        System.out.println("0 - Voltar");
        op = Input.nextInt();
        int idPesquisa = 0;
        switch (op) {
            case 1:        
             emp = CadastroEmprestimo.cadastrar();
            if(emp.getLivro().getId() != null){
                daoEmprestimo.salvar(emp);
            }                  
                
                break;
            case 2:
                System.out.println("Informe o ID: ");
                idPesquisa = Input.nextInt();
                daoEmprestimo.atualizar(CadastroEmprestimo.editar(daoEmprestimo.carregarPorID(idPesquisa)));
                break;
            case 3:
                System.out.println("Informe o ID: ");
                idPesquisa = Input.nextInt();
                daoEmprestimo.remover(daoEmprestimo.carregarPorID(idPesquisa));
                break;
            case 4:
            System.out.println("Informe o ID: ");
            idPesquisa = Input.nextInt();
            System.out.println("");
            emp = daoEmprestimo.carregarPorID(idPesquisa);
            emp.exibirInformacoes();              
            break;                    
            default:
                if(op != 0){ 
                    System.out.println("\nOpção inválida!");
                }
        }
    }
}

public static void devolucao(){
    System.out.println("Informe o ID do Emprestimo");
    int idPesquisa = Input.nextInt();
            Emprestimo emp = daoEmprestimo.carregarPorID(idPesquisa);
    if(emp.getStatus().equals("Pendente") && emp.getId() != null){
        System.out.println("Emprestimo Encontrado!");
        System.out.println("Deseja devolver o Livro " + emp.getLivro().getTitulo() + "? S/N");
        String op = Input.next();

        if(op.equals("S") || op.equals("s")){
            emp.setDataDevolucao(LocalDate.now());
            emp.setStatus("Finalizado");
            daoEmprestimo.atualizar(emp);
        }
        
    }else{
        System.out.println("Esse emprestimo nao existe ou ja foi Finalizado!");
    }
}

public static void listarEmprestimos(){
System.out.println("Relatorio de Contratos");

ArrayList<Emprestimo> listaEmprestimos = daoEmprestimo.carregarListaEmprestimos();
System.out.println("----------------------------------------------");
for(int i=0;i<listaEmprestimos.size();i++){
    listaEmprestimos.get(i).exibirInformacoes();
    System.out.println("----------------------------------------------");
}
}

public static void listarLivros(){
    System.out.println("Relatorio de Livros");

    ArrayList<Livro> listaLivros = new ArrayList<>();
    listaLivros = daoLivro.carregarListaLivros();
    System.out.println("----------------------------------------------");
    for(int i=0;i<listaLivros.size();i++){
        listaLivros.get(i).exibirInformacoes();
        System.out.println("----------------------------------------------");
    }
}

public static void listarClientes(){
    System.out.println("Relatorio de Clientes com Emprestimos Pendentes");
    System.out.println("----------------------------------------------");

    String pendente = "Pendente";
ArrayList<Emprestimo> listaEmprestimos = daoEmprestimo.carregarListaEmprestimos();

for(int i=0;i<listaEmprestimos.size();i++){    
            if(listaEmprestimos.get(i).getStatus().equals(pendente)){
                listaEmprestimos.get(i).getCliente().exibirInformacoes();
                System.out.println("Emprestimo: " + listaEmprestimos.get(i).getId() + " Livro Pendente: "+ listaEmprestimos.get(i).getLivro().getTitulo());
                System.out.println("----------------------------------------------");
                }  
}
    

}
}