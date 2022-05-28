
package lista.java;

import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        String nome;
        float salarioFixo, totalVendas, valorTotalSalario;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o nome: ");
        nome = leitor.nextLine();
        System.out.println("Informe o salário fixo: ");
        salarioFixo = leitor.nextFloat();
        System.out.println("Informe o valor total de vendas no mês: ");
        totalVendas = leitor.nextFloat();
        
        valorTotalSalario = salarioFixo + (totalVendas * 0.15f);
        System.out.format("\nValor do salário final %.2f", valorTotalSalario);
    }
}

