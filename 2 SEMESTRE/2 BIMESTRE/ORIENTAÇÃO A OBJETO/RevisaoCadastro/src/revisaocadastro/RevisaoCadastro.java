package revisaocadastro;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class RevisaoCadastro {
private static Scanner leitor = new Scanner(System.in);
   
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<>();
        int op;
        do{
        System.out.println("1 - Cadastrar Pessoa");
        System.out.println("2 - Pesquisar por Nome ou CPF");
        System.out.println("3 - Remover Pessoa");
        System.out.println("4 - Exibir Nomes");
       
        op = leitor.nextInt();
        
        switch(op){
            
            case 1:
                lista.add(cadastrarPessoa());
                
                break;
                
            case 2:
                System.out.println("Deseja Pesquisar por:");
                System.out.println("1 - Nome");
                System.out.println("2 - CPF");
                
                int op2 = leitor.nextInt();
                pesquisar(op2, lista);
                
                break;
                
            case 3:
                remover(lista);
                break;
                
            case 4:
                listar(lista);
                break;
        }
    }while(op != 0);
    }
    
    public static Pessoa cadastrarPessoa() {
        System.out.println("Informe o nome do Aluno");
        String n = leitor.useDelimiter("\\n").next();
        System.out.println("Informe o CPF");
        String c = leitor.useDelimiter("\\n").next();
        System.out.println("Informe a Data de Nascimento");
        LocalDate d = LocalDate.of(leitor.nextInt(), leitor.nextInt(), leitor.nextInt());
        System.out.println("Informe a Cidade");
        String ci = leitor.useDelimiter("\\n").next();
        System.out.println("Informe o Numero");
        int num = leitor.nextInt();
        System.out.println("Informe a Rua");
        String r = leitor.useDelimiter("\\n").next();
        
        long i = ChronoUnit.YEARS.between(d,LocalDate.now());
        
        Endereco e = new Endereco(num, ci, r);
        
        Pessoa p = new Pessoa(n,c,d,e,i);
        
        return p;
    }
    
    public static void pesquisar(int opcao, ArrayList<Pessoa> l){
        int aux = 0;
        if(opcao == 1){
            System.out.println("Informe o Nome (ou parte dele) que deseja buscar");
            String nome = leitor.next();
            for (int i = 0; i < l.size(); i++) {
                if(l.get(i).nome.equals(nome) || l.get(i).nome.contains(nome)){
                    System.out.println(l.get(i).toString());
                    aux = 1;
                }               
            }           
        }
        
        if(opcao == 2){
            System.out.println("Informe o CPF (ou parte dele) que deseja buscar");
            String cpf = leitor.next();
            for (int i = 0; i < l.size(); i++) {
                if(l.get(i).cpf.equals(cpf) || l.get(i).cpf.contains(cpf)){
                    System.out.println(l.get(i).toString());
                    aux = 1;
                }              
            }           
        }
        
        if(aux == 0){
            System.out.println("Aluno Nao Encontrado");
        }
    }
    
    public static void remover(ArrayList<Pessoa> l){
        int aux = 0;
        System.out.println("Informe o CPF da pessoa que deseja remover");
            String cpf = leitor.next();
            for (int i = 0; i < l.size(); i++) {
                if(l.get(i).cpf.equals(cpf)){
                    l.remove(i);
                    aux = 1;
                    break;
                }                
            }
            
            if(aux == 1){
                System.out.println("Aluno Removido!");
            }else{
                System.out.println("Aluno Nao Encontrado");
            }
        }
    
   public static void listar(ArrayList<Pessoa> l){
       System.out.println("Deseja ordem 1 - Crescente ou 2 - Decrescente");
       int esc = leitor.nextInt();
       
       if(esc == 1){
           Collections.sort(l);
       }
       if(esc == 2){
           Collections.reverse(l);
       }
       
       
       System.out.println("Lista:");
       System.out.println("------------------------------");
            for (int i = 0; i < l.size(); i++) {
                System.out.println(l.get(i).getNome()+' '+l.get(i).getCpf()+" - " +l.get(i).getIdade());
                System.out.println(l.get(i).getEndereco().getCidade().toUpperCase()+": "+l.get(i).getEndereco().getRua()+", "+l.get(i).getEndereco().getNumero());
                System.out.println("------------------------------");
    }
       
       
   }
    
}
