package revisaostring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class RevisaoString {
    private static Scanner leitor = new Scanner(System.in);
 public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        int op;
            do{
        System.out.println("--------------");
        System.out.println("1 - Cadastrar Nome");
        System.out.println("2 - Pesquisar por Nome");
        System.out.println("3 - Remover Nome");
        System.out.println("4 - Exibir Nomes");
        System.out.println("5 - Exibir Lista com Iniciais");
        op = leitor.nextInt();
        
        if(op == 1){
            cadastrarNome(nomes);
        }
        if(op == 2){
            pesquisar(nomes);
        }
        if(op == 3){
            removerNome(nomes);
        }
        if(op == 4){
            System.out.println("Escolha a Ordem");
            System.out.println("1 - Crescente");
            System.out.println("2 - Decrescente");
            int esc = leitor.nextInt();
            exibir(nomes, esc);
        }
        if(op == 5){
            for (int i = 0; i < nomes.size(); i++) {
               String nome = nomes.get(i);
               System.out.println(iniciaisNome(nome));
            }
           
            
            
        }
     }while(op != 0);
            
 }
 
 
public static void cadastrarNome(ArrayList<String> l){
     System.out.println("Informe o nome: ");
     String n = leitor.useDelimiter("\\n").next();
     l.add(n);
     
 }
   
 public static void removerNome(ArrayList<String> l){
     System.out.println("Informe o nome: ");
     String r = leitor.useDelimiter("\\n").next();
     l.remove(r);
}

public static ArrayList<String> pesquisar(ArrayList<String> l){
    ArrayList<String> retorno = new ArrayList();
    System.out.println("Informe o nome:");
    String p = leitor.useDelimiter("\\n").next();
    
    for (int i = 0; i < l.size(); i++) {
        if(l.get(i).contains(p)){
            retorno.add(l.get(i));
            
        }
    }
    System.out.println(retorno);
    return retorno;
}

public static void exibir(ArrayList<String> l, int ordem){
    if(ordem == 1){
        Collections.sort(l);
    }else{
        Collections.reverse(l);
    }   
    
    System.out.println("Lista de Nome");
    for (int i = 0; i < l.size(); i++) {
        System.out.println((i+1)+" - "+l.get(i));
    }
}

public static String iniciaisNome(String nome){
    String str = nome.replaceAll(" e "," ");
    str = str.replaceAll(" de "," ");
    str = str.replaceAll(" do "," ");
    str = str.replaceAll(" da "," ");
    str = str.replaceAll(" dos "," ");
    str = str.replaceAll(" das "," ");
    str = str.replaceAll(" di "," ");
    str = str.replaceAll(" du "," ");
    
    char caracteres[] = str.toCharArray();
    String converte = Character.toString(caracteres[0]);
    
    for (int i = 0; i < caracteres.length; i++) {
        if(caracteres[i] == ' '){
           String letra = Character.toString(caracteres[i+1]);
           converte = converte.concat(letra);                 
    }
    
}
    return converte;
}
}
        