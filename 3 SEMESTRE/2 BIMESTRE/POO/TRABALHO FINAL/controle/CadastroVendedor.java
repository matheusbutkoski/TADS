package controle;

import modelo.Vendedor;
import util.Input;


public class CadastroVendedor{

    public static Vendedor cadastrar() {
        Vendedor v = new Vendedor();
        setarInformacoes(v);
        return v;
    }
    public static void setarInformacoes(Vendedor v) {
         
        System.out.print("Nome: ");
        v.setNome(Input.next());
        
        System.out.print("CPF: ");
        v.setCpf(Input.next());
        
        CadastroEndereco.setarInformacoes(v.getEndereco());   

        System.out.println("Informe o Salario:");
        v.setSalario(Input.nextDouble());
       
    }

    public static Vendedor editar(Vendedor v) {         
        setarInformacoes(v);   
        return v;
    }

}