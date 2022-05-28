package lista.java;

import java.util.Scanner;

public class Ex4 {
    
    
    public static void main(String[] args){
        int x1, x2, y1, y2, dX, dY;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Primeiro ponto");
        System.out.println("Infome o valor do eixo X");
        x1 = leitor.nextInt();
        System.out.println("Infome o valor do eixo Y");
        y1 = leitor.nextInt();
        
        System.out.println("Segundo ponto:");
        System.out.println("Infome o valor do eixo X");
        x2 = leitor.nextInt();
        System.out.println("Infome o valor do eixo Y");
        y2 = leitor.nextInt();
        
        
       if(x1 >= x2){ 
       dX = x1 - x2;
       }else{
       dX = x2 - x1;
       }
       
       if(y1 >= y2){
       dY = y1 - y2;
       }else{
       dY = y2 - y1;
       }
        System.out.println("Distancia entre os pontos:("+dX+","+dY+")");
       
    }
}
