
package herancapolimorfismo;

import java.time.LocalDate;
import java.util.Scanner;

public class EditarFuncionario {
    private Scanner leitor = new Scanner(System.in);
    
    public Funcionario editarFuncionario(Funcionario f){
        
                
        System.out.println("Informe o novo Nome:");
        f.setNome(leitor.useDelimiter("\\n").next());
        System.out.println("CPF:");
        f.setCpf(leitor.useDelimiter("\\n").next());
        System.out.println("Data de Nascimento: AAAA-MM-DD");
        String d = leitor.next();
        f.setDataNasc(LocalDate.parse(d));     
        System.out.println("Data de Admissao: AAAA-MM-DD");
        String dA = leitor.next();
        f.setDataAdmissao(LocalDate.parse(dA));
        
        Endereco e = new Endereco();
        System.out.println("Informe a Cidade");
        e.setCidade(leitor.useDelimiter("\\n").next());
        
        System.out.println("Informe o Numero");
        e.setNumero(leitor.nextInt());
        
        System.out.println("Informe a Rua");
        e.setRua(leitor.useDelimiter("\\n").next());

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
            Horista h = (Horista) f;
            System.out.println("CTPS:");
            h.setCTPS(leitor.useDelimiter("\\n").next());
            System.out.println("Valor da Hora:");
            h.setValorHora(leitor.nextFloat());                     
            return h;
        } else if (f instanceof Comissionado) {
            Horista h = (Horista) f;
            System.out.println("CTPS:");
            h.setCTPS(leitor.useDelimiter("\\n").next());
            System.out.println("Valor da Hora:");
            h.setValorHora(leitor.nextFloat());                     
            return h;
        }
        return f;
    }
}
