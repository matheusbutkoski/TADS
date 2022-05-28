package lista.java;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        float valorVeiculo;
        double valorFinal, parcela;
        
        System.out.println("Informe o valor do veiculo");
        valorVeiculo = leitor.nextFloat();
        System.out.println("Valor dos impostos");
        
        System.out.println("IPI: "+valorVeiculo*0.11f);
        System.out.println("PIS: "+valorVeiculo*0.116);
        System.out.println("ICMS: "+valorVeiculo*0.145);
        System.out.println("IPVA e Emplacamento: "+valorVeiculo*0.04);
        
        valorFinal = valorVeiculo * Math.pow(1.02,60);
        
        parcela = valorFinal/60;
        
        System.out.format("Valor apos financiamento: %.2f\n",valorFinal);
        System.out.format("Valor da parcela: %.2f\n",parcela);
    }
}
