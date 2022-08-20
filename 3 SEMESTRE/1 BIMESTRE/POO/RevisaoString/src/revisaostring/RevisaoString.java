package revisaostring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class RevisaoString {
    private static Scanner leitor = new Scanner(System.in);
 public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
          
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

public static String iniciasNome(String nome){
    String str = nome.replaceAll(" e "," ");
    str = str.replaceAll(" e "," ");
    return str;
}
}
