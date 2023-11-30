package modelo;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import controle.CadastroCliente;
import controle.CadastroContratoLocacao;
import controle.CadastroContratoVenda;
import controle.CadastroImovel;
import controle.CadastroPessoa;
import controle.CadastroVendedor;
import persistencia.DaoCliente;
import persistencia.DaoContratoLocacao;
import persistencia.DaoContratoVenda;
import persistencia.DaoImoveis;
import persistencia.DaoPessoa;
import persistencia.DaoVendedor;
import persistencia.DataBaseConnection;
import util.Input;

public class Imoveis_AS {
    private static final PrintStream OUT = System.out;
    private static DaoPessoa daoPessoa = new DaoPessoa();
    private static DaoCliente daoCliente = new DaoCliente();
    private static DaoVendedor daoVendedor = new DaoVendedor();
    private static DaoImoveis daoImovel = new DaoImoveis();
    private static DaoContratoLocacao daoContratoLocacao = new DaoContratoLocacao();
    private static DaoContratoVenda daoContratoVenda = new DaoContratoVenda();

    public static void main(String[] args) {
        DataBaseConnection.getConnection();
        int op = -1;
        while (op != 0) {
            OUT.println("Menu");
            OUT.println("1 - CRUD Pessoas, Clientes, Vendedores");
            OUT.println("2 - CRUD Imoveis");
            OUT.println("3 - CRUD Contratos");
            OUT.println("4 - Gerar Relatorios");
            OUT.println("0 - Sair");
            op = Input.nextInt();
            switch (op) {
                case 1:
                    int op2;
                    OUT.println("Informe qual tipo deseja");
                    OUT.println("1 - Pessoa");
                    OUT.println("2 - Cliente");
                    OUT.println("3 - Vendedor");

                    op2 = Input.nextInt();
                    if (op2 == 1) {
                        crudPessoas();
                    }
                    if (op2 == 2) {
                        crudClientes();
                    }
                    if (op2 == 3) {
                        crudVendedores();
                    }
                    break;
                case 2:
                    crudImoveis();
                    break;
                case 3:
                    int op3;
                    OUT.println("Informe qual tipo deseja");
                    OUT.println("1 - Contrato locacao");
                    OUT.println("2 - Contrato venda");
                    op3 = Input.nextInt();

                    if (op3 == 1) {
                        crudContratoLocacao();
                    }
                    if (op3 == 2) {
                        crudContratoVenda();
                    }
                    break;
                case 4:
                    int op4;
                    OUT.println("Informe qual tipo de relatorio deseja");
                    OUT.println("1 - Relatorio de Imoveis");
                    OUT.println("2 - Relatorio de Proprietarios e seus imoveis");
                    OUT.println("3 - Relatorio de Contratos");
                    op4 = Input.nextInt();
                    if (op4 == 1) {
                        listarImoveis();
                    }
                    if (op4 == 2) {
                        listarPessoas();
                    }
                    if (op4 == 3) {
                        listarContratos();
                    }
                    break;

                default:
                    if (op != 0) {
                        OUT.println("\nopção inválida!");
                    }
            }
        }
    }

    public static void crudPessoas() {
        int op = -1;
        while (op != 0) {
            OUT.println("");
            OUT.println("1 - Cadastrar ");
            OUT.println("2 - Editar ");
            OUT.println("3 - Remover ");
            OUT.println("4 - Listar ");
            OUT.println("0 - Voltar");
            op = Input.nextInt();
            String cpfPesquisa = null;
            switch (op) {
                case 1:
                    daoPessoa.salvar(CadastroPessoa.cadastrar());
                    break;
                case 2:
                    OUT.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    daoPessoa.atualizar(CadastroPessoa.editar(daoPessoa.carregarPorCPF(cpfPesquisa)));
                    break;
                case 3:
                    OUT.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    daoPessoa.remover(daoPessoa.carregarPorCPF(cpfPesquisa));
                    break;
                case 4:
                    OUT.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    Pessoa pessoa = daoPessoa.carregarPorCPF(cpfPesquisa);
                    pessoa.exibirInformacoes();
                    break;
                default:
                    if (op != 0) {
                        OUT.println("\nopção inválida!");
                    }
            }
        }
    }

    public static void crudClientes() {
        int op = -1;
        while (op != 0) {
            OUT.println("");
            OUT.println("1 - Cadastrar ");
            OUT.println("2 - Editar ");
            OUT.println("3 - Remover ");
            OUT.println("4 - Listar ");
            OUT.println("0 - voltar");
            op = Input.nextInt();
            String cpfPesquisa = null;
            switch (op) {
                case 1:
                    Cliente cli = CadastroCliente.cadastrar();
                    daoCliente.salvar(cli);
                    break;
                case 2:
                    OUT.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    daoCliente.atualizar(CadastroCliente.editar(daoCliente.carregarPorCPF(cpfPesquisa)));
                    break;
                case 3:
                    OUT.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    daoCliente.remover(daoCliente.carregarPorCPF(cpfPesquisa));
                    break;
                case 4:
                    OUT.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    Cliente cliente = daoCliente.carregarPorCPF(cpfPesquisa);
                    cliente.exibirInformacoes();
                    break;
                default:
                    if (op != 0) {
                        OUT.println("\nopção inválida!");
                    }
            }
        }
    }

    public static void crudVendedores() {
        int op = -1;
        while (op != 0) {
            OUT.println("");
            OUT.println("1 - Cadastrar ");
            OUT.println("2 - Editar ");
            OUT.println("3 - Remover ");
            OUT.println("4 - Pesquisar ");
            OUT.println("0 - voltar");
            op = Input.nextInt();
            String cpfPesquisa = null;
            switch (op) {
                case 1:
                    Vendedor ven = CadastroVendedor.cadastrar();
                    daoVendedor.salvar(ven);
                    break;
                case 2:
                    OUT.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    daoVendedor.atualizar(CadastroVendedor.editar(daoVendedor.carregarPorCPF(cpfPesquisa)));
                    break;
                case 3:
                    OUT.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    daoVendedor.remover(daoVendedor.carregarPorCPF(cpfPesquisa));
                    break;
                case 4:
                    OUT.println("Informe o cpf: ");
                    cpfPesquisa = Input.next();
                    Vendedor vendedor = daoVendedor.carregarPorCPF(cpfPesquisa);
                    vendedor.exibirInformacoes();
                    break;
                default:
                    if (op != 0) {
                        OUT.println("\nopção inválida!");
                    }
            }
        }
    }

    public static void crudImoveis() {
        int op = -1;
        while (op != 0) {
            OUT.println("");
            OUT.println("1 - Cadastrar ");
            OUT.println("2 - Editar ");
            OUT.println("3 - Remover ");
            OUT.println("4 - Pesquisar ");
            OUT.println("0 - voltar");
            op = Input.nextInt();
            String matriculaPesquisa = null;
            switch (op) {
                case 1:
                    Imovel imo = CadastroImovel.cadastrar();
                    daoImovel.salvar(imo);
                    break;

                case 2:
                    OUT.println("Informe a matricula do imovel que deseja editar:");
                    matriculaPesquisa = Input.next();
                    daoImovel.atualizar(CadastroImovel.editar(daoImovel.carregarPorMatricula(matriculaPesquisa)));
                    break;

                case 3:
                    OUT.println("Informe a matricula do imovel que deseja remover:");
                    matriculaPesquisa = Input.next();
                    daoImovel.remover(daoImovel.carregarPorMatricula(matriculaPesquisa));
                    break;

                case 4:
                    OUT.println("Informe a matricula do imovel que deseja pesquisar:");
                    matriculaPesquisa = Input.next();
                    Imovel imovel = daoImovel.carregarPorMatricula(matriculaPesquisa);
                    imovel.exibirInformacoes();
                    break;

            }
        }
    }

    public static void crudContratoLocacao() {
        int op = -1;
        while (op != 0) {
            OUT.println("");
            OUT.println("1 - Cadastrar ");
            OUT.println("2 - Editar ");
            OUT.println("3 - Remover ");
            OUT.println("4 - Pesquisar ");
            OUT.println("0 - Voltar");
            op = Input.nextInt();
            int idPesquisa;
            switch (op) {
                case 1:
                    daoContratoLocacao.salvar(CadastroContratoLocacao.cadastrar());
                    break;
                case 2:
                    OUT.println("Informe o id: ");
                    idPesquisa = Input.nextInt();
                    daoContratoLocacao
                            .atualizar(CadastroContratoLocacao.editar(daoContratoLocacao.carregarPorId(idPesquisa)));
                    break;
                case 3:
                    OUT.println("Informe o id: ");
                    idPesquisa = Input.nextInt();
                    daoContratoLocacao.remover(daoContratoLocacao.carregarPorId(idPesquisa));
                    break;
                case 4:
                    OUT.println("Informe o id: ");
                    idPesquisa = Input.nextInt();
                    ContratoLocacao contrato = daoContratoLocacao.carregarPorId(idPesquisa);
                    contrato.exibirInformacoes();
                    break;
                default:
                    if (op != 0) {
                        OUT.println("\nopção inválida!");
                    }
            }
        }
    }

    public static void crudContratoVenda() {
        int op = -1;
        while (op != 0) {
            OUT.println("");
            OUT.println("1 - Cadastrar ");
            OUT.println("2 - Editar ");
            OUT.println("3 - Remover ");
            OUT.println("4 - Pesquisar ");
            OUT.println("0 - Voltar");
            op = Input.nextInt();
            int idPesquisa;
            switch (op) {
                case 1:
                    daoContratoVenda.salvar(CadastroContratoVenda.cadastrar());
                    break;
                case 2:
                    OUT.println("Informe o id: ");
                    idPesquisa = Input.nextInt();
                    daoContratoVenda
                            .atualizar(CadastroContratoVenda.editar(daoContratoVenda.carregarPorId(idPesquisa)));
                    break;
                case 3:
                    OUT.println("Informe o id: ");
                    idPesquisa = Input.nextInt();
                    daoContratoVenda.remover(daoContratoVenda.carregarPorId(idPesquisa));
                    break;
                case 4:
                    OUT.println("Informe o id: ");
                    idPesquisa = Input.nextInt();
                    ContratoVenda contrato = daoContratoVenda.carregarPorId(idPesquisa);
                    contrato.exibirInformacoes();
                    break;
                default:
                    if (op != 0) {
                        OUT.println("\nopção inválida!");
                    }
            }
        }
    }

    public static void listarImoveis() {
        OUT.println("\nRelatorio de Imoveis");

        ArrayList<Imovel> listaImoveis = new ArrayList<>();
        listaImoveis = daoImovel.carregarImoveis();
        for (int i = 0; i < daoImovel.carregarImoveis().size(); i++) {
            listaImoveis.get(i).exibirInformacoes();
        }
    }

    public static void listarPessoas() {
        System.out.println("\nRelatorio de Proprietarios\n");

        ArrayList<Imovel> listaImoveis = new ArrayList<>();
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        listaImoveis = daoImovel.carregarImoveis();

        for (int i = 0; i < listaImoveis.size(); i++) {
            listaPessoas.add(listaImoveis.get(i).getProprietario());
        }

        CadastroPessoa.ordenarLista(listaPessoas);

        for (int i = 0; i < listaPessoas.size(); i++) {
            int idPessoa = listaPessoas.get(i).getId();

            for (int j = 0; j < listaImoveis.size(); j++) {
                int idProprietario = listaImoveis.get(j).getProprietario().getId();
                if (idProprietario == idPessoa) {
                    System.out.print("proprietario: ");
                    listaPessoas.get(i).exibirInformacoes();
                    System.out.println("imovel: " + listaImoveis.get(j).getMatriculaImovel());
                }
            }
        }
    }

    public static void listarContratos() {
        System.out.println("\nRelatorio de Contratos\n");
        int op = -1;
        String matricula, cpf;

        ArrayList<ContratoLocacao> listaContratoLocacao = new ArrayList<>();
        ArrayList<ContratoVenda> listaContratoVenda = new ArrayList<>();
        listaContratoLocacao = daoContratoLocacao.carregarListaContrato();
        listaContratoVenda = daoContratoVenda.carregarListaContrato();

        System.out.println("1 - Contrato Locacao");
        System.out.println("2 - Contrato Venda");
        System.out.println("3 - Matricula do imovel");
        System.out.println("4 - CPF do cliente");
        op = Input.nextInt();

        System.out.println("\n");

        Collections.sort(listaContratoLocacao);
        if (op == 1) {
            System.out.println("Listando contratos em ordem de data de inicio...");
            for (int i = 0; i < listaContratoLocacao.size(); i++) {
                listaContratoLocacao.get(i).exibirInformacoes();
            }
        }
        if (op == 2) {
            for (int i = 0; i < listaContratoVenda.size(); i++) {
                listaContratoVenda.get(i).exibirInformacoes();
            }
        }
        if (op == 3) {
            System.out.println("informe a matricula do imovel: ");
            matricula = Input.next();
            
            for (int i = 0; i < listaContratoVenda.size(); i++) {
                if (listaContratoVenda.get(i).getImovel().getMatriculaImovel().equals(matricula)) {
                    listaContratoVenda.get(i).exibirInformacoes();
                }
            }
            for (int i = 0; i < listaContratoLocacao.size(); i++) {
                if (listaContratoVenda.get(i).getImovel().getMatriculaImovel().equals(matricula)) {
                    listaContratoLocacao.get(i).exibirInformacoes();
                }
            }
        }
        if (op == 4) {
            System.out.println("informe o cpf do cliente: ");
            cpf = Input.next();

            for (int i = 0; i < listaContratoVenda.size(); i++) {
                if (listaContratoVenda.get(i).getCliente().getCpf().equals(cpf)) {
                    listaContratoVenda.get(i).exibirInformacoes();
                }
            }
            for (int i = 0; i < listaContratoLocacao.size(); i++) {
                if (listaContratoVenda.get(i).getCliente().getCpf().equals(cpf)) {
                    listaContratoLocacao.get(i).exibirInformacoes();
                }
            }
        }
    }
}
