package controle;

import modelo.Casa;
import modelo.Cliente;
import modelo.ContratoLocacao;
import modelo.ContratoVenda;
import modelo.Endereco;
import modelo.Imovel;
import modelo.Pessoa;
import modelo.Vendedor;
import util.DateUtils;
import util.Input;

public class Main {

    public static void main(String[] args) {
        Pessoa proprietario1 = new Pessoa("Pedro", "111", DateUtils.createLocalDate(1, 3, 2000), new Endereco("cascavel", 100, "brasil"));
        Imovel imovel1 = new Casa("123", proprietario1, new Endereco("Cascavel", 1200, "Parana"), 12, 23, 120000);
        Imovel imovel2 = new Casa("456", proprietario1, new Endereco("Cascavel", 3560, "Tito Muffato"), 15, 20, 175000);
        
        CadastroImovel.getImoveis().add(imovel1);
        CadastroImovel.getImoveis().add(imovel2);
        
        Cliente cliente1 = new Cliente("Ana", "222", DateUtils.createLocalDate(12, 5, 2000), new Endereco("cascavel", 800, "Carlos gomes"));
        Cliente cliente2 = new Cliente("Paulo", "333", DateUtils.createLocalDate(13, 4, 2000), new Endereco("cascavel", 1340, "Manaus"));
        
        CadastroCliente.getPessoas().add(cliente1);
        CadastroCliente.getPessoas().add(cliente2);
        
        Vendedor vend1 = new Vendedor(0.05, 1200,"Marcos", "777", DateUtils.createLocalDate(1, 3, 2001), new Endereco("cascavel", 9010, "Tancredo"));
        Vendedor vend2 = new Vendedor(0.05, 1500,"Paula", "888", DateUtils.createLocalDate(10, 3, 2002), new Endereco("cascavel", 2076, "Recife"));
        
        CadastroCliente.getPessoas().add(vend1);
        CadastroCliente.getPessoas().add(vend2);
        
        ContratoLocacao contr1 = new ContratoLocacao(DateUtils.createLocalDate(10, 1, 2022), DateUtils.createLocalDate(10, 1, 2023), 0.1, 1, vend1, cliente1, imovel1, 1200);
        ContratoVenda contr2 = new ContratoVenda("A Vista", 1, 2, vend2, cliente2, imovel2, 175000);
        
        CadastroContrato.getContratos().add(contr1);
        CadastroContrato.getContratos().add(contr2);
        
        int op = -1;
        while (op != 0) {
            System.out.println("Menu");
            System.out.println("1 - Cadastro de imóveis");
            System.out.println("2 - Cadastro de clientes");
            System.out.println("3 - Cadastro de funcionários");
            System.out.println("4 - Locação de imóveis");
            System.out.println("5 - Venda de imóveis");
            System.out.println("0 - sair");
            op = Input.nextInt();
            switch (op) {
                case 1:
                    cadastroDeImoveis();
                    break;
                case 2:
                    cadastroDeClientes();
                    break;
                case 3:
                    cadastroDeImoveis();
                    break;
                case 4:
                    cadastroLocacaoImoveis();
                    break;
                case 5:
                    cadastroVendaImoveis();
                    break;
                default:
                    if(op != 0){ 
                        System.out.println("\nopção inválida!");
                    }
            }
        }
    }

    public static void cadastroDeImoveis() {
        int op = -1;
        while (op != 0) {
            System.out.println("");
            System.out.println("1 - Cadastrar imóvel");
            System.out.println("2 - Editar imóvel");
            System.out.println("3 - Remover imóvel");
            System.out.println("4 - Listar imóveis");
            System.out.println("0 - voltar");
            op = Input.nextInt();
            String matricula = null;
            switch (op) {
                case 1:
                    CadastroImovel.cadastrar();
                    break;
                case 2:
                    System.out.println("informe a matrícula do imóvel: ");
                    matricula = Input.next();
                    CadastroImovel.editar(CadastroImovel.pesquisar(matricula));
                    break;
                case 3:
                    System.out.println("informe a matrícula do imóvel: ");
                    matricula = Input.next();
                    CadastroImovel.remover(CadastroImovel.pesquisar(matricula));
                    break;
                case 4:
                    CadastroImovel.listar();
                    break;
                default:
                    if(op != 0){ 
                        System.out.println("\nopção inválida!");
                    }
            }
        }
    }

    public static void cadastroDeClientes() {
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
                    CadastroCliente.cadastrar();
                    break;
                case 2:
                    System.out.println("informe o cpf: ");
                    cpfPesquisa = Input.next();
                    CadastroCliente.editar(CadastroCliente.pesquisar(cpfPesquisa));
                    break;
                case 3:
                    System.out.println("informe o cpf: ");
                    cpfPesquisa = Input.next();
                    CadastroCliente.remover(CadastroCliente.pesquisar(cpfPesquisa));
                    break;
                case 4:
                    CadastroCliente.listar();
                    break;
                default:
                    if(op != 0){ 
                        System.out.println("\nopção inválida!");
                    }
            }
        }
    }

    public static void cadastroDeVendedores() {
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
                    CadastroVendedor.cadastrar();
                    break;
                case 2:
                    System.out.println("informe o cpf: ");
                    cpfPesquisa = Input.next();
                    CadastroVendedor.editar(CadastroVendedor.pesquisar(cpfPesquisa));
                    break;
                case 3:
                    System.out.println("informe o cpf: ");
                    cpfPesquisa = Input.next();
                    CadastroVendedor.remover(CadastroVendedor.pesquisar(cpfPesquisa));
                    break;
                case 4:
                    CadastroVendedor.listar();
                    break;
                default:
                    if(op != 0){ 
                        System.out.println("\nopção inválida!");
                    }
            }
        }
    }

    public static void cadastroLocacaoImoveis() {
        int op = -1;
        while (op != 0) {
            System.out.println("");
            System.out.println("1 - Cadastrar ");
            System.out.println("2 - Editar ");
            System.out.println("3 - Remover ");
            System.out.println("4 - Listar ");
            System.out.println("0 - voltar");
            op = Input.nextInt();
            int idPesquisa;
            switch (op) {
                case 1:
                    CadastroContratoLocacao.cadastrar();
                    break;
                case 2:
                    System.out.println("informe o id do contrato: ");
                    idPesquisa = Input.nextInt();
                    CadastroContratoLocacao.editar(CadastroContratoLocacao.pesquisar(idPesquisa));
                    break;
                case 3:
                    System.out.println("informe o id do contrato: ");
                    idPesquisa = Input.nextInt();
                    CadastroContratoLocacao.remover(CadastroContratoLocacao.pesquisar(idPesquisa));
                    break;
                case 4:
                    CadastroContratoLocacao.listar();
                    break;
                default:
                    if(op != 0){ 
                        System.out.println("\nopção inválida!");
                    }
            }
        }
    }

    public static void cadastroVendaImoveis() {
        int op = -1;
        while (op != 0) {
            System.out.println("");
            System.out.println("1 - Cadastrar ");
            System.out.println("2 - Editar ");
            System.out.println("3 - Remover ");
            System.out.println("4 - Listar ");
            System.out.println("0 - voltar");
            op = Input.nextInt();
            int idPesquisa;
            switch (op) {
                case 1:
                    CadastroContratoVenda.cadastrar();
                    break;
                case 2:
                    System.out.println("informe o id do contrato: ");
                    idPesquisa = Input.nextInt();
                    CadastroContratoVenda.editar(CadastroContratoLocacao.pesquisar(idPesquisa));
                    break;
                case 3:
                    System.out.println("informe o id do contrato: ");
                    idPesquisa = Input.nextInt();
                    CadastroContratoVenda.remover(CadastroContratoLocacao.pesquisar(idPesquisa));
                    break;
                case 4:
                    CadastroContratoVenda.listar();
                    break;
                default:
                    System.out.println("\nopção inválida!");
            }
        }
    }
}