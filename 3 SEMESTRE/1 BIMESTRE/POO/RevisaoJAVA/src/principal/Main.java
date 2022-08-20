package principal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    private static Scanner teclado;
    
   
    public static void main(String[] args) {
        
        System.out.println("Data: "+ DateUtils.createDate(19, 8, 2022));
        System.out.println("Data: "+ DateUtils.createLocalDate(19, 8, 2022));
        System.out.println("Data atual: "+ DateUtils.obterDataAtualSistema());
        System.out.println("Data atual: "+ DateUtils.obterLocalDateAtualSistema());
        
//        double x = 12.1256;
//        System.out.println("x="+NumberUtils.formatarValor(x, 3));
//        System.out.println("x="+NumberUtils.formatarValorPorcentagem(x, 2));
//        
//        ArrayList<Integer> numeros = new ArrayList<>(); 
//        numeros.add(1);
//        numeros.add(2);
//        numeros.add(3);
//        numeros.add(3);
//        numeros.add(4);
//        numeros.add(5);
//        numeros.add(5);
//        
//        ArrayList<Integer> moda = NumberUtils.moda(numeros);
//        System.out.println("moda: "+moda);
        
        
        ArrayList<String> nomes = new ArrayList<>();
        teclado = new Scanner(System.in);
        int op = -1;
        while(op != 0){
            System.out.println("\n--Menu--");
            System.out.println("Digite 1 para cadastrar nome");
            System.out.println("Digite 2 para pesquisar nome");
            System.out.println("Digite 3 para remover nome");
            System.out.println("Digite 4 para exibir lista de nomes");
            System.out.println("Digite 5 para exibir lista de nomes com as iniciais");
            System.out.println("Digite 0 para sair");
            op = teclado.nextInt();

            switch (op){
                case 1:
                    cadastrar(nomes);
                    break;
                case 2:
                    exibirLista(filtrarNomes(nomes), true);
                    break;
                case 3:
                    remover(nomes);
                    break;
                case 4:
                    System.out.println("\nDigite 1 para exibir lista em ordem crescente");
                    System.out.println("Digite 2 para exibir lista em ordem decrescente");
                    if(teclado.nextInt() == 2)
                        exibirLista(nomes, false);
                    else
                        exibirLista(nomes, true);
                    break;
                case 5:
                    exibirLista(gerarListaNomesComIniciais(nomes), true);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("\nOpção inválida!");
            }
        }
    }
    
    public static void cadastrar(ArrayList<String> list){
        System.out.println("Informe o nome:");
        String nome = teclado.useDelimiter("\\n").next();
        list.add(nome);
    }
    
    public static void remover(ArrayList<String> list){
        System.out.println("Informe o nome:");
        String nome = teclado.useDelimiter("\\n").next();
        if(list.remove(nome)){
            System.out.println(nome+" foi removido com sucesso!");
        }
        else{
            System.out.println("Falha ao remover o nome: "+nome);
        }
    }
    
    public static ArrayList<String> filtrarNomes(ArrayList<String> list){
        ArrayList<String> retorno = new ArrayList<>();
        System.out.println("Informe o nome:");
        String nome = teclado.useDelimiter("\\n").next();
        
        for (int i = 0; i < list.size(); i++) {
            if( list.get(i).contains(nome)){
                retorno.add(list.get(i));
            }
        }
        
        return retorno;
    }
    
    public static void exibirLista(ArrayList<String> list, boolean ordemCrescente){
        if(ordemCrescente){
            Collections.sort(list);
        }
        else{
            Collections.reverse(list);
        }
        
        System.out.println("Lista de Nomes\n");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1)+" - "+list.get(i));
        }
    }
    
    public static ArrayList<String> gerarListaNomesComIniciais(ArrayList<String>list) {
        ArrayList<String> nomesComIniciais = new ArrayList<>();
        for (int i = 0; i <list.size(); i++) {
            String nome = list.get(i);
            nome += " - " + StringUtils.obterIniciaisNome(nome); //Acrescentar iniciais ao final no nome
            nomesComIniciais.add(nome);
        }
        return nomesComIniciais;
    }
    
    
}
