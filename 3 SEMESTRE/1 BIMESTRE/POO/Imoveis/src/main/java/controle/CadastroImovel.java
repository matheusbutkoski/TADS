
package controle;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Chacara;
import modelo.Endereco;
import modelo.Imovel;
import modelo.Pessoa;
import modelo.Sitio;
import java.time.LocalDate;
import java.util.Scanner;

public class CadastroImovel {
     private Scanner leitor = new Scanner(System.in);
     public Imovel cadastrarImovel(int tipo) {
        System.out.println("Informe a Matricula do Imovel:");
        String m = leitor.useDelimiter("\\n").next();
        System.out.println("Informe o nome do Proprietario:");
        String n = leitor.useDelimiter("\\n").next();
        System.out.println("Informe o CPF do Proprietario:");
        String cpf = leitor.useDelimiter("\\n").next();
        System.out.println("Data de Nascimento do Proprietário: AAAA-MM-DD");
        String d = leitor.next();
        System.out.println("Informe o Endereco do Proprietario:");              
        System.out.println("Informe a Cidade:");
        String ci1 = leitor.useDelimiter("\\n").next();  
        System.out.println("Informe a Rua:");
        String r1 = leitor.useDelimiter("\\n").next();
        System.out.println("Informe o Numero:");
        int num1 = leitor.nextInt();
        Endereco e1 = new Endereco(num1, ci1, r1);
        
        Pessoa p = new Pessoa(n,cpf,LocalDate.parse(d),e1);
        
        
        System.out.println("Informe o Endereco do Imovel:");              
        System.out.println("Informe a Cidade:");
        String ci = leitor.useDelimiter("\\n").next();  
        System.out.println("Informe a Rua:");
        String r = leitor.useDelimiter("\\n").next();
        System.out.println("Informe o Numero:");
        int num = leitor.nextInt();
        
         System.out.println("Informe a Largura do imovel");
         double l = leitor.nextDouble();
         System.out.println("Informe o Comprimento do imovel");
         double com = leitor.nextDouble();
         System.out.println("Informe o Valor do imovel");
         double val = leitor.nextDouble();
         
         
            
         Endereco e2 = new Endereco(num, ci, r);         
         Imovel i = null;
         
        
        if (tipo == 1) {
             i = new Casa(m, p, e2, l, com, val);
        } else if (tipo == 2) {
             i = new Apartamento(m, p, e2, l, com, val);
        } else if (tipo == 3){
             i = new Sitio(m, p, e2, l, com, val);
        } else if (tipo == 4){
             i = new Chacara(m, p, e2, l, com, val);
        }

        return i;
    }
          
}
