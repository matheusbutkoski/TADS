package modelo;

import controle.CadastroCliente;
import controle.CadastroContrato;
import controle.CadastroContratoLocacao;
import controle.CadastroPessoa;
import controle.CadastroVendedor;
import controle.CadastroImovel;
import modelo.Cliente;
import modelo.ContratoLocacao;
import modelo.ContratoVenda;
import modelo.Endereco;
import modelo.Imovel;
import modelo.Pessoa;
import modelo.Vendedor;
import persistencia.DaoCliente;
import persistencia.DaoEndereco;
import persistencia.DaoImoveis;
import persistencia.DaoPessoa;
import persistencia.DaoVendedor;
import persistencia.DataBaseConnection;
import util.DateUtils;
import util.Input;

public class Imoveis_AS {
    private static DaoPessoa daoPessoa = new DaoPessoa();
    private static DaoCliente daoCliente = new DaoCliente();
    private static DaoVendedor daoVendedor = new DaoVendedor();
    private static DaoImoveis daoImovel = new DaoImoveis();
    
    public static void main(String[] args) {      
         DataBaseConnection.getConnection();
         int op = -1;
        while (op != 0) {
            System.out.println("Menu");
            System.out.println("1 - CRUD Pessoas, Clientes, Vendedores");
            System.out.println("2 - CRUD Imoveis");
            System.out.println("3 - CRUD Contratos");
            System.out.println("4 - Gerar Relatorios");
            System.out.println("0 - Sair");
            op = Input.nextInt();
            switch (op) {
                case 1:
                    int op2;
                    System.out.println("Informe qual tipo deseja");
                    System.out.println("1 - Pessoa");                  
                    System.out.println("2 - Cliente");                  
                    System.out.println("3 - Vendedor");
                    
                    op2 = Input.nextInt();
                        if(op2 == 1){
                            crudPessoas();
                        }if(op2 == 2){
                            crudClientes();
                        }if(op2 == 3){
                            crudVendedores();
                        }
                    break;
                case 2:        
                    crudImoveis();                   
                    break;
                case 3:
                System.out.println("Tipo de imóvel");
                System.out.println("1 - Contrato Venda");
                System.out.println("2 - Contrato Locacao");
                int op3 = Input.nextInt();
                Contrato p = null;
                switch (op3) {
                    case 1:
                    
                         p= new ContratoVenda();
                        
                        break;
                    case 2:
                        p = new ContratoLocacao();
                        CadastroContratoLocacao.cadastrar();
                        break;
                }
                    CadastroContrato.cadastrar(p);
                    break;
                case 4:
                   // cadastroLocacaoImoveis();
                    break;
                case 5:
                    //cadastroVendaImoveis();
                    break;
                default:
                    if(op != 0){ 
                        System.out.println("\nopção inválida!");
                    }
            }
        }
    }

    public static void crudPessoas() {
        int op = -1;
        while (op != 0) {
            System.out.println("");
            System.out.println("1 - Cadastrar ");
            System.out.println("2 - Editar ");
            System.out.println("3 - Remover ");
            System.out.println("4 - Listar ");
            System.out.println("0 - Voltar");
            op = Input.nextInt();
            String cpfPesquisa = null;
            switch (op) {
                case 1:                   
                    daoPessoa.salvar(CadastroPessoa.cadastrar());
                    break;
                case 2:
                    System.out.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();                    
                    daoPessoa.atualizar(CadastroPessoa.editar(daoPessoa.carregarPorCPF(cpfPesquisa)));
                    break;
                case 3:
                    System.out.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    daoPessoa.remover(daoPessoa.carregarPorCPF(cpfPesquisa));
                    break;
                case 4:
                    System.out.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    Pessoa pessoa = daoPessoa.carregarPorCPF(cpfPesquisa);
                    pessoa.exibirInformacoes();              
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
            System.out.println("1 - Cadastrar ");
            System.out.println("2 - Editar ");
            System.out.println("3 - Remover ");
            System.out.println("4 - Listar ");
            System.out.println("0 - voltar");
            op = Input.nextInt();
            String cpfPesquisa = null;
            switch (op) {
                case 1:
                    
                    Cliente cli = CadastroCliente.cadastrar();                   
                    daoCliente.salvar(cli);
                    break;
                case 2:
                    System.out.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    daoCliente.atualizar(CadastroCliente.editar(daoCliente.carregarPorCPF(cpfPesquisa)));
                    break;
                case 3:
                    System.out.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    daoCliente.remover(daoCliente.carregarPorCPF(cpfPesquisa));
                    break;
                case 4:
                System.out.println("Informe o cpf: ");
                cpfPesquisa = Input.next();
                Cliente cliente = daoCliente.carregarPorCPF(cpfPesquisa);
                cliente.exibirInformacoes();              
                break;                    
                default:
                    if(op != 0){ 
                        System.out.println("\nopção inválida!");
                    }
            }
        }
    }

    public static void crudVendedores() {
        int op = -1;
        while (op != 0) {
            System.out.println("");
            System.out.println("1 - Cadastrar ");
            System.out.println("2 - Editar ");
            System.out.println("3 - Remover ");
            System.out.println("4 - Pesquisar ");
            System.out.println("0 - voltar");
            op = Input.nextInt();
            String cpfPesquisa = null;
            switch (op) {
                case 1:
                    Vendedor ven = CadastroVendedor.cadastrar();
                    daoVendedor.salvar(ven);
                    break;
                case 2:
                    System.out.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    daoVendedor.atualizar(CadastroVendedor.editar(daoVendedor.carregarPorCPF(cpfPesquisa)));
                    break;
                case 3:
                    System.out.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    daoVendedor.remover(daoVendedor.carregarPorCPF(cpfPesquisa));
                    break;
                case 4:
                System.out.println("Informe o cpf: ");
                cpfPesquisa = Input.next();
                Vendedor vendedor = daoVendedor.carregarPorCPF(cpfPesquisa);
                vendedor.exibirInformacoes();              
                break;
                default:
                    if(op != 0){ 
                        System.out.println("\nopção inválida!");
                    }
            }
        }
    }

    public static void crudImoveis(){
        int op = -1;
        while (op != 0) {
            System.out.println("");
            System.out.println("1 - Cadastrar ");
            System.out.println("2 - Editar ");
            System.out.println("3 - Remover ");
            System.out.println("4 - Pesquisar ");
            System.out.println("0 - voltar");
            op = Input.nextInt();
            String matriculaPesquisa = null;
                switch(op){
                    case 1:
                    Imovel imo = CadastroImovel.cadastrar();
                    daoImovel.salvar(imo);
                    break;

                    case 2:
                    System.out.println("Informe a matricula do imovel que deseja editar:");
                    matriculaPesquisa = Input.next();
                    daoImovel.atualizar(CadastroImovel.editar(daoImovel.carregarPorMatricula(matriculaPesquisa)));
                    break;
                    
                    case 3:
                    System.out.println("Informe a matricula do imovel que deseja remover:");
                    matriculaPesquisa = Input.next();
                    daoImovel.remover(daoImovel.carregarPorMatricula(matriculaPesquisa));
                    break;

                    case 4:
                    System.out.println("Informe a matricula do imovel que deseja pesquisar:");
                    matriculaPesquisa = Input.next();
                    Imovel imovel = daoImovel.carregarPorMatricula(matriculaPesquisa);
                    imovel.exibirInformacoes();
                    break;

                }
        }
    }
    public static void listarPessoas(){
        System.out.println("\nLista de Pessoas");
        for (Pessoa pessoa : daoPessoa.carregarPessoas()) {
           System.out.println(""+pessoa.toString());
       }
   }
}


    


