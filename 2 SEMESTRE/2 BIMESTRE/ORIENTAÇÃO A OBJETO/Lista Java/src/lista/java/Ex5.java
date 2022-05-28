package lista.java;
import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args){
       float n1, n2, n3, mA; 
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o valor da Primeira Nota");
        n1 = leitor.nextFloat();
        System.out.println("Informe o valor da Segunda Nota");
        n2 = leitor.nextFloat();
        System.out.println("Informe o valor da Terceira Nota");
        n3 = leitor.nextFloat();
        
        mA = (n1 + (n2 * 2) + (n3 * 3))/6;
        
        if(mA <= 4.0f){
            System.out.format("Media Final: %.2f\n", mA);
            System.out.println("Conceito: E");
            System.out.println("REPROVADO!");
    }
        
          if(mA > 4 && mA < 6){
            System.out.format("Media Final: %.2f\n",mA);
            System.out.println("Conceito: D");
            System.out.println("REPROVADO!");
    }
         
          if(mA > 6 && mA < 7.5f){
            System.out.format("Media Final: %.2f\n", mA);
            System.out.println("Conceito: C");
            System.out.println("APROVADO!");
    }
          if(mA > 7.5f && mA < 9){
            System.out.format("Media Final: %.2f\n", mA);
            System.out.println("Conceito: B");
            System.out.println("APROVADO!");
    }
           if(mA >= 9){
            System.out.format("Media Final: %.2f\n", mA);
            System.out.println("Conceito: A");
            System.out.println("APROVADO!");
    }
          
          
    }
    
}
