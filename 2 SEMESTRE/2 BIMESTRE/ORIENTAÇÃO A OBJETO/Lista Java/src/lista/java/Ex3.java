package lista.java;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args){
        int dis;
        float com, consumoMedio;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a distancia percorrida em Km");
        dis = leitor.nextInt();
        System.out.println("Informe o total de combustivel utilizado na distancia em Litros");
        com = leitor.nextFloat();
        
        consumoMedio = dis/com;
        System.out.println("Consumo Medio: "+consumoMedio+" Km/L");
        }
    
}
