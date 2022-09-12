package herancapolimorfismo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroFuncionario {

    private Scanner leitor = new Scanner(System.in);

    public CadastroFuncionario() {
    }

    public Funcionario cadastrarFuncionario(int tipo) {
        System.out.println("Informe o Nome:");
        String n = leitor.useDelimiter("\\n").next();
        System.out.println("Informe o CPF:");
        String c = leitor.useDelimiter("\\n").next();
        
        System.out.println("Data de Nascimento: AAAA-MM-DD");
        String d = leitor.next();               
        System.out.println("Data de Admissao: AAAA-MM-DD");
        String dA = leitor.next();
        System.out.println("Informe o Cargo:");
        String cg = leitor.useDelimiter("\\n").next();
                
        System.out.println("Informe a Cidade:");
        String ci = leitor.useDelimiter("\\n").next();  
        System.out.println("Informe a Rua:");
        String r = leitor.useDelimiter("\\n").next();
        System.out.println("Informe o Numero:");
        int num = leitor.nextInt();
            
         Endereco e = new Endereco(num, ci, r);         
         Funcionario f = null;
        
        if (tipo == 1) {
             f = new Estagiario(n, c, LocalDate.parse(d), e, cg, LocalDate.parse(dA));
        } else if (tipo == 2) {
             f = new Horista(n, c, LocalDate.parse(d), e, cg, LocalDate.parse(dA));
        } else if (tipo == 3){
             f = new Mensalista(n, c, LocalDate.parse(d), e, cg, LocalDate.parse(dA));
        } else if (tipo == 4){
             f = new Comissionado(n, c, LocalDate.parse(d), e, cg, LocalDate.parse(dA));
        }

        if (f instanceof Estagiario) {
            Estagiario es = (Estagiario) f;
            System.out.println("Carga Horaria Mensal:");
            es.setCargaHoraria(leitor.nextInt());
            System.out.println("Salario Base:");
            es.setSalarioBase(leitor.nextFloat());
            return es;
        } else if (f instanceof Horista) {
            Horista h = (Horista) f;
            System.out.println("CTPS:");
            h.setCTPS(leitor.useDelimiter("\\n").next());
            System.out.println("Valor da Hora:");
            h.setValorHora(leitor.nextFloat());                     
            return h;
        } else if (f instanceof Mensalista) {
            Mensalista m = (Mensalista) f;
            System.out.println("CTPS:");
            m.setCTPS(leitor.useDelimiter("\\n").next());
            System.out.println("Salario Base:");
            m.setSalarioBase(leitor.nextFloat());
            System.out.println("Carga Horaria Mensal:");
            m.setCargaHoraria(leitor.nextInt());
            return m;
        } else if (f instanceof Comissionado) {
            Comissionado co = (Comissionado) f;
            System.out.println("CTPS:");
            co.setCTPS(leitor.useDelimiter("\\n").next());
            System.out.println("Salario Base:");
            co.setSalarioBase(leitor.nextFloat());
            System.out.println("Carga Horaria Mensal:");
            co.setCargaHoraria(leitor.nextInt());
            System.out.println("Percentual Comissao:");
            co.setPorcentagemComissao(leitor.nextFloat());                     
            return co;
        }
        return f;
    }

  
}
