package controle;

import modelo.Horista;
import modelo.Mensalista;
import modelo.Comissionado;
import modelo.Funcionario;
import modelo.Estagiario;
import util.Input;
import java.util.ArrayList;
import java.util.Collections;

public class CadastroFuncionario {

    public static Funcionario cadastrar() {
        Funcionario funcionario;
        System.out.println("Qual o tipo de Contrato? ");
        System.out.println("1 - Mensalista");
        System.out.println("2 - Comissionado");
        System.out.println("3 - Horista");
        System.out.println("4 - Estagiário");

        int op = Input.nextInt();

        switch (op) {
            case 1:
                funcionario = new Mensalista();
                setarDadosFuncionario(funcionario);
                return funcionario;

            case 2:
                funcionario = new Comissionado();
                setarDadosFuncionario(funcionario);
                return funcionario;

            case 3:
                funcionario = new Horista();
                setarDadosFuncionario(funcionario);
                return funcionario;

            case 4:
                funcionario = new Estagiario();
                setarDadosFuncionario(funcionario);
                return funcionario;
        }

        return null;
    }

    public static void editar(Funcionario funcionario) {
        if (funcionario == null) {
            System.out.println("Falha ao editar Funcionário!");
            return;
        }
        setarDadosFuncionario(funcionario);
    }

    public static void setarDadosFuncionario(Funcionario funcionario) {
        setarDadosBasicosFuncionario(funcionario);
        if (funcionario instanceof Mensalista) {
            setarDadosMensalista((Mensalista) funcionario);
        }
        else if (funcionario instanceof Comissionado) {
            setarDadosComissionado((Comissionado) funcionario);
        }
        else if (funcionario instanceof Horista) {
            setarDadosHorista((Horista) funcionario);
        }
        else if (funcionario instanceof Estagiario) {
            setarDadosEstagiario((Estagiario) funcionario);
        }else{
            System.out.println("Falha ao editar Funcionário!");
        }

//        switch (funcionario) {
//            case Mensalista me ->
//                setarDadosMensalista(me);
//            case Comissionado co ->
//                setarDadosComissionado(co);
//            case Horista ho ->
//                setarDadosHorista(ho);
//            case Estagiario es ->
//                setarDadosEstagiario(es);
//            default -> System.out.println("Falha ao editar Funcionário!");
//        }
    }

    public static void setarDadosBasicosFuncionario(Funcionario func) {
        CadastroPessoa.setarInformacoes(func);
        System.out.println("\nCadatro das informações profissionais");
        System.out.print("Cargo:");
        func.setCargo(Input.nextLine());
        System.out.print("Data Admissão (ano-mês-dia):");
        func.setDataAdmissao(Input.nextLocalDate());
    }

    public static void setarDadosMensalista(Mensalista mensalista) {
        System.out.print("CTPS: ");
        mensalista.setCtps(Input.next());
        System.out.print("Carga horária mensal: ");
        mensalista.setCargaHoraria(Input.nextInt());
        System.out.print("Salário base: ");
        mensalista.setSalarioBase(Input.nextDouble());
    }

    public static void setarDadosComissionado(Comissionado comissionado) {
        System.out.print("CTPS: ");
        comissionado.setCtps(Input.next());
        System.out.print("Carga horária mensal: ");
        comissionado.setCargaHoraria(Input.nextInt());
        System.out.print("Salário base: ");
        comissionado.setSalarioBase(Input.nextDouble());
        System.out.print("Percentual de comissao: ");
        comissionado.setPercentualComissao(Input.nextDouble() / 100);
    }

    public static void setarDadosHorista(Horista horista) {
        System.out.print("CTPS: ");
        horista.setCtps(Input.next());
        System.out.print("Valor hora: ");
        horista.setValorHora(Input.nextDouble());
    }

    public static void setarDadosEstagiario(Estagiario estagiario) {
        System.out.print("Carga horária mensal: ");
        estagiario.setCargaHoraria(Input.nextInt());
        System.out.print("Salário base: ");
        estagiario.setSalarioBase(Input.nextDouble());
    }

    public static void ordenarLista(ArrayList<Funcionario> list) {
        System.out.println("1 - Ascendente: ");
        System.out.println("2 - Descendente: ");
        int op = Input.nextInt();

        if (op == 1) {
            Collections.sort(list);
        } else {
            Collections.sort(list, Collections.reverseOrder());
        }
    }

    public static void listar(ArrayList<Funcionario> list) {
        if (list.isEmpty()) {
            System.out.println("A Lista está Vazia!");
        } else {
            ordenarLista(list);
            System.out.println("\n#########---------- Lista de Funcionarios ----------#########");
            int n = 1;
            for (Funcionario p : list) {
                System.out.print("\n" + (n++) + ". ");
                p.exibirInformacoes();
            }
            System.out.println("\n#########---------- ######### ----------#########");
        }
    }

    public static void removerFuncionario(ArrayList<Funcionario> list) {
        System.out.println("Digite o cpf do Funcionário a ser excluido: ");
        String cpf = Input.next();
        for (int i = 0; i < list.size(); i++) {
            if (cpf.compareTo(list.get(i).getCpf()) == 0) {
                Funcionario f = list.get(i);
                list.remove(f);
                System.out.println("O Funcionário: " + f.getNome() + " - " + f.getCpf() + " foi Removido com Sucesso!");
                return;
            }
        }
        System.out.println("Funcionário não encontrado!");
    }

    public static Funcionario pesquisarFuncionario(ArrayList<Funcionario> list) {
        System.out.println("Digite o cpf para buscar o cadastro:");
        String cpf = Input.next();
        for (Funcionario p : list) {
            if (cpf.compareTo(p.getCpf()) == 0) {
                return p;
            }
        }
        return null;
    }

    public static double calculoDescontoINSS(double salario) {
        if (salario <= 1212) { //Até R$ 1.212  7,5%
            return (salario * 0.075);
        } else if (salario <= 2427.36) { // R$ 1.212 a R$ 2.427,35  9%
            return salario * 0.09;
        } else if (salario <= 3614.03) { // R$ 2.427,36 a R$ 3.614,03 12%
            return salario * 0.12;
        } else if (salario <= 7087.22) { //  R$ 3.641,03 a R$ 7.087,22  14%
            return salario * 0.14;
        } else { // acima de 7087.22
            return 7087.22 * 0.14;
        }
    }

    public static double calculoFGTS(double salario) {
        return salario * 0.08;
    }

    public static void folhaPagamentoMes(ArrayList<Funcionario> list) {
        if (list.isEmpty()) {
            System.out.println("A Lista está Vazia!");
        } else {
            Collections.sort(list);
            System.out.println("\n########----- Folha de Pagamento -----########");
            for (Funcionario p : list) {
                System.out.println("\nFuncionário: " + p.getNome() + "\tCargo:" + p.getCargo());
                p.calculoFolhaPagmento();
            }
            System.out.println("\n########----- Fim da Folha de Pagamento -----########");
        }
    }

}
