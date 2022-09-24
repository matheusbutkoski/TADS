package controle;

import modelo.Cliente;
import util.Input;

public class CadastroCliente {
    
    public static Cliente cadastrar(){
        Cliente cliente = new Cliente();
        setarDadosCliente(cliente);
        return cliente;
    }
    
    public static void editar(Cliente cli){
        setarDadosCliente(cli);
    }
    
    public static void setarDadosCliente(Cliente cli){
        CadastroPessoa.setarInformacoes(cli);
        
        System.out.println("Limite crédito: ");
        cli.setLimiteCredito(Input.nextDouble());
    }
}
