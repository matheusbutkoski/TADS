package aulapoo;

import java.util.Date;
import java.util.Scanner;

public class AulaPOO {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       int op;
       Pessoa p[] = new Pessoa[50];
       int contP = 0;
       do{
        System.out.println("Escolha uma opcao");
        System.out.println("1 - Cadastrar Usuario");
        System.out.println("2 - Editar Usuario");
        System.out.println("3 - Listar todos os Usuarios");
        System.out.println("0 - Sair");
        op = teclado.nextInt();
        switch(op){
            case 1 -> {
                p[contP] = cadastrar();
                contP++;
            }
            case 2 -> {
                System.out.println("Informe o cpf do usuario que deseja editar");
                String busca = teclado.next();
                for(int i=0;i<50;i++){
                    if(p[i] != null && p[i].getCpf().equals(busca)){
                        p[i] = editar(p[i]);
                    }
                }
                
            }
            
            case 3 -> {
                listar(p);
            }
        }
            
        
        
    }while(op != 0);
    }
    
    
    public static Pessoa cadastrar(){
        
        Pessoa p1 = new Pessoa();
        Scanner teclado = new Scanner(System.in);
        
         System.out.println("Informe o nome: ");
        p1.setNome(teclado.nextLine());
        System.out.println("Informe o cpf:  ");
        p1.setCpf(teclado.next());
        System.out.println("Informe a data de nascimento:  ");
        Date d = new Date(teclado.next());
        p1.setDataNascimento(d);
       
        System.out.println("Informe a cidade");
        p1.getEndereco().setCidade(teclado.useDelimiter("\\n").next());
        System.out.println("Informe a rua");
        p1.getEndereco().setRua(teclado.useDelimiter("\\n").next());
        System.out.println("Informe o Numero");
        p1.getEndereco().setNumero(teclado.nextInt());
        
        return p1;
    }
    
    public static Pessoa editar(Pessoa e1){
        int opE;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o que deseja editar");
        System.out.println("1 - Dados");
        System.out.println("2 - Endereço");
        opE = teclado.nextInt();
        
        if(opE == 1){
        System.out.println("Informe o novo Nome: ");
        e1.setNome(teclado.next());
        System.out.println("Informe o novo cpf:  ");
        e1.setCpf(teclado.next());
        System.out.println("Informe a nova data de nascimento:  ");
        Date d = new Date(teclado.next());
        e1.setDataNascimento(d);
        }
        
        
        if(opE == 2){
        System.out.println("Informe a cidade");
        e1.getEndereco().setCidade(teclado.useDelimiter("\\n").next());
        System.out.println("Informe a rua");
        e1.getEndereco().setRua(teclado.useDelimiter("\\n").next());
        System.out.println("Informe o Numero");
        e1.getEndereco().setNumero(teclado.nextInt());
        }
        
            return e1;
        }
    
    public static void listar(Pessoa[] l){
        for(int i = 0; i < l.length; i++){
            if(l[i] != null){
            System.out.println("Nome: "+l[i].getNome());
            System.out.println("CPF: "+l[i].getCpf());
            System.out.println("Data de Nascimento: "+l[i].getDataNascimento());
            System.out.println("Cidade: "+l[i].getEndereco().getCidade());
            System.out.println("Rua: "+l[i].getEndereco().getRua());
            System.out.println("Numero: "+l[i].getEndereco().getNumero());
          } 
        }
        
        
    }
        
}
