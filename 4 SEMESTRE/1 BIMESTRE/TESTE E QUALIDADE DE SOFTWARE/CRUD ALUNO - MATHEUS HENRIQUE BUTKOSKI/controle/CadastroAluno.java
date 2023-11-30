package controle;

import modelo.Aluno;
import util.Input;

public class CadastroAluno {
    
public static Aluno cadastrar() {
        Aluno a = new Aluno();
        setarInformacoes(a);
        return a;
    }

    public static void setarInformacoes(Aluno a) {
         
        System.out.print("Nome: ");
        a.setNome(Input.next());
        
        System.out.print("RA: ");
        a.setRa(Input.next());
        
         
    }

    public static Aluno editar(Aluno a) {       
        setarInformacoes(a);   
        return a;
    }
}
