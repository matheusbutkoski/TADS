package lista.java;

import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade, maiorIdade = 0, menorIdade = 1000;
        float altura, maiorAltura = 0, menorAltura = 1000;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a idade: ");
            idade = leitor.nextInt();
            System.out.println("Informe a altura: ");
            altura = leitor.nextFloat();
            if(idade > maiorIdade){
                maiorIdade = idade;
            }
            if(idade < menorIdade){
                menorIdade = idade;
            }
            if(altura > maiorAltura){
                maiorAltura = altura;
            }
            if(altura < menorAltura){
                menorAltura = altura;
            }
        }
        
        System.out.println("Maior idade: "+ maiorIdade);
        System.out.println("Menor idade: "+ menorIdade);
        System.out.format("\nMaior altura: %.2f", maiorAltura);
        System.out.format("\nMenor altura: %.2f", menorAltura);
    }
}

