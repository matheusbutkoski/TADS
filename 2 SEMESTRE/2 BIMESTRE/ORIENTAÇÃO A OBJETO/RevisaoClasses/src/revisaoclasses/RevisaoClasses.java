
package revisaoclasses;

import java.util.ArrayList;


public class RevisaoClasses {

   
    public static void main(String[] args) {
     
        String a = "12.12";
        System.out.println("String convertida para Double:"+NumberUtils.parseDouble(a));
        System.out.println("String convertida para Float:"+NumberUtils.parseFloat(a));
        System.out.println("String convertida para Int:"+NumberUtils.parseInt(a));
        System.out.println("String convertida para Long:"+NumberUtils.parseLong(a));
              
        ArrayList<Integer> teste = new ArrayList();
        
        teste.add(2);
        teste.add(4);
        teste.add(7);
        teste.add(9);
        teste.add(7);
        
        ArrayList<Integer> pesos = new ArrayList();
        
        pesos.add(1);
        pesos.add(1);
        pesos.add(2);
        pesos.add(2);
        pesos.add(1);
        
        System.out.println("Lista Ordenada Decrescente:"+NumberUtils.ordenarLista(teste, false));
        System.out.println("Lista Ordenada Crescente:"+NumberUtils.ordenarLista(teste, true));
        System.out.println("Maior:"+NumberUtils.maiorValor(teste));
        System.out.println("Menor:"+NumberUtils.menorValor(teste));
        System.out.println("Media:"+NumberUtils.arredonda(NumberUtils.mediaValores(teste), 2));
        System.out.println("Media Ponderada:"+NumberUtils.arredonda(NumberUtils.mediaPonderadaValores(teste,pesos), 2));
        System.out.println("Mediana:"+NumberUtils.medianaValores(teste));
        System.out.println("Moda:"+NumberUtils.moda(teste));
        
        
        double x = 3.1415;
        
        System.out.println("Arredonda:"+NumberUtils.arredonda(x, 2));
        
        System.out.println("Formata:"+NumberUtils.formatarValor(x, 3));
        
        System.out.println("Porcentagem:"+NumberUtils.formatarValorPorcentagem(x, 2));
        
        System.out.println("Moeda:"+NumberUtils.formatarValorMoeda(x, 2));
       
    }
    
}
