package controle;

import modelo.Cliente;
import util.Input;


public class CadastroCliente{

    public static Cliente cadastrar() {
        Cliente c = new Cliente();
        setarInformacoes(c);
        return c;
    }

    public static void setarInformacoes(Cliente c) {
         
        System.out.print("Nome: ");
        c.setNome(Input.next());
        
        System.out.print("CPF: ");
        c.setCpf(Input.next());
        
        CadastroEndereco.setarInformacoes(c.getEndereco());   
    }

    public static Cliente editar(Cliente c) {       
        setarInformacoes(c);   
        return c;
    }

}
