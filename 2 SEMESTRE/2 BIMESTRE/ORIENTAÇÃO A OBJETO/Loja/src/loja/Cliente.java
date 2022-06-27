
package loja;

import java.util.Date;



public class Cliente extends Usuario {   
    public Cliente(){
        
        
    }
    
    public Cliente(String n, String l, String s, String e, String Cpf, double lmt, Endereco end){
        super.nome = n;
        super.login = l;
        super.email = e;
        super.senha = s;
        super.cpf = Cpf;
        super.limite = lmt;
        super.endereco = end;
        super.tipoUsuario = "Cliente";
    }
}
