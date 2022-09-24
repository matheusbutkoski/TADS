package controle;

import modelo.Pessoa;
import util.Input;

/**
 *
 * @author Andre
 */
public class CadastroPessoa {
    
    public static Pessoa cadastrar() {
        Pessoa p = new Pessoa();
        setarInformacoes(p);
        return p;
    }
    
    public static void setarInformacoes(Pessoa p) {
        if(p == null){
            System.out.println("Falha ao setar informações da Pessoa!");
            return;
        }
        
        System.out.print("\nNome: ");
        p.setNome(Input.nextLine());
        
        System.out.print("CPF: ");
        p.setCpf(Input.next());
        
        System.out.print("Data Nascimento (ano-mês-dia): ");
        p.setDataNasc(Input.nextLocalDate());
        
        CadastroEndereco.setarInformacoes(p.getEndereco());
    }
}
