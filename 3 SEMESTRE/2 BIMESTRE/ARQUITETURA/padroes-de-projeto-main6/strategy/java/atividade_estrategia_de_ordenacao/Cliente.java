/**
* Engenharia de Software Moderna - Padrões de Projeto (Cap. 6)
* Prof. Marco Tulio Valente
* 
* Exemplo do padrão de projeto Strategy
*
*/

package strategy.java.atividade_estrategia_de_ordenacao;

import strategy.java.atividade_estrategia_de_ordenacao.modelo.MinhaLista;
import strategy.java.atividade_estrategia_de_ordenacao.strategy.SelectionSortStrategy;
import strategy.java.atividade_estrategia_de_ordenacao.strategy.InsertionSortStrategy;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("Lista #1 foi ordenada com a estratégia default: BubbleSort");
        
        int [] elementos1 = {7,3,5,2,4,1,6};
        MinhaLista lista1 = new MinhaLista(elementos1);
        lista1.ordenar(); // ordena lista usando estratégia default: Bubble Sort
        lista1.print();
        
        System.out.println("\nLista #2 foi ordenada com uma outra estratégia: SelectionSort");
        
        int [] elementos2 = {6,5,4,3,2,1,7};
        MinhaLista lista2 = new MinhaLista(elementos2);
        lista2.setOrdenacaoStrategy(new SelectionSortStrategy());
        lista2.ordenar(); // ordena lista usando Selection Sort
        lista2.print(); 
        
        System.out.println("\nLista #3 foi ordenada com uma outra estratégia: InsertionSort");
        
        int [] elementos3 = {7,8,9,4,5,6,1,2,3};
        MinhaLista lista3 = new MinhaLista(elementos3);
        lista3.setOrdenacaoStrategy(new InsertionSortStrategy());
        lista3.ordenar(); // ordena lista usando Selection Sort
        lista3.print(); 
        
        /* Implemente mais 2 estratégias de ordenação    
         * 
         *  insertionsort 
            shellsort 
            mergesort 
            quicksortcle
            quicksort2
            heapsort
            heapsort
            bucketsort 
          */
        
        //System.out.println("\nLista #3 foi ordenada com uma outra estratégia: ????????");
             
      }

}
