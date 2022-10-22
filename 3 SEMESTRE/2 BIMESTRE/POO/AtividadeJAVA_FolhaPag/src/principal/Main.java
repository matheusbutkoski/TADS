package principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
    }

    public static Funcionario cadastrarFuncionario() {
        Funcionario func = null;

        System.out.println("Qual o tipo de contato d funcinário?");
        System.out.println("1 - Mensalista");
        System.out.println("2 - Comissionado");
        System.out.println("3 - Horista");
        System.out.println("4 - Estagiário");
        int op = teclado.nextInt();

        switch (op) {
            case 1 :
                func = new Mensalista();
                break;
            case 2 : 
                func = new Comissionado();
                break;
            case 3 : 
                func = new Horista();
                break;
            case 4 :
                func = new Estagiario();
                break;
            default :
                System.out.println("Opção inválida!");
        }

        salvarInformacoes(func);
        return func;
    }
    
    public static Funcionario editar(Funcionario func) {
        if (func == null) {
            return null;
        }

        salvarInformacoes(func);
        return func;
    }
    
    public static void salvarInformacoes(Funcionario func) {
        if (func == null) {
            return;
        }

        System.out.println("Nome: ");
        func.setNome(teclado.useDelimiter("\\n").next());
        System.out.println("CPF: ");
        func.setCpf(teclado.useDelimiter("\\n").next());
        System.out.println("Data Nascimento: ");
        LocalDate d = LocalDate.parse(teclado.useDelimiter("\\n").next());
        func.setDataNasc(d);

        System.out.println("Cidade: ");
        func.getEndereco().setCidade(teclado.useDelimiter("\\n").next());
        System.out.println("Rua: ");
        func.getEndereco().setRua(teclado.useDelimiter("\\n").next());
        System.out.println("numero: ");
        func.getEndereco().setNumero(teclado.useDelimiter("\\n").nextInt());

        System.out.println("Cargo: ");
        func.setCargo(teclado.useDelimiter("\\n").next());
        System.out.println("Data admissão: ");
        d = LocalDate.parse(teclado.useDelimiter("\\n").next());
        func.setDataAdmissao(d);

        if (func instanceof Mensalista) {
            Mensalista me = (Mensalista) func;
            me.setSalarioBase(1200);
            me.setCtps("38484323");
            me.setCargaHoraria(220);
        } else if(func instanceof Comissionado)  {
            Comissionado co = (Comissionado) func;
            co.setSalarioBase(1200);
            co.setCtps("38484323");
            co.setCargaHoraria(220);
            co.setPercentualComissao(0.05);
        }else if(func instanceof Horista)  {
            Horista ho = (Horista) func;
            ho.setValorHora(30);
            ho.setCtps("38484323");
        }else if(func instanceof Estagiario)  {
            Estagiario es = (Estagiario) func;
            es.setSalarioBase(100);
            es.setCargaHoraria(200);
        }
    }
         
}
