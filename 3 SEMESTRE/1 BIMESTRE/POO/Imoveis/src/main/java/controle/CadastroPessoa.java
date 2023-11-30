package controle;

import java.time.LocalDate;
import java.util.Scanner;
import modelo.Pessoa;
import modelo.Endereco;


public class CadastroPessoa {
     private Scanner leitor = new Scanner(System.in);
     
public CadastroPessoa(){
    
}
 
    
    public Pessoa setarInformacoes() {
        
        System.out.print("\nNome: ");
        String n = leitor.useDelimiter("\\n").next();
        
        System.out.print("CPF: ");
        String cpf = leitor.useDelimiter("\\n").next();
        
        System.out.print("Data Nascimento (ano-mês-dia): ");
        LocalDate d = LocalDate.parse(leitor.useDelimiter("\\n").next());
        
        System.out.print("Cidade: ");
        String ci = leitor.useDelimiter("\\n").next();
        
        System.out.print("Rua: ");
        String rua = leitor.useDelimiter("\\n").next();
        
        System.out.print("Número: ");
        int num = leitor.nextInt();
        
        Endereco e = new Endereco(num,ci,rua);
        Pessoa p = new Pessoa(n, cpf, d, e);
        
        return p;
    }
}
