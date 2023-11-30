
import modelo.MinhaLista;
import strategy.SelectionSortStrategy;
import strategy.InsertionSortStrategy;
import strategy.MergeSortStrategy;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("Lista #1 foi ordenada com a estratégia default: BubbleSort");
        
        int [] elementos1 = {7,3,5,2,4,1,6};
        MinhaLista lista1 = new MinhaLista(elementos1);
        lista1.ordenar(); // ordena lista usando estratégia default: Bubble Sort
        lista1.print();
        
        System.out.println("\nLista #2 foi ordenada a estratégia: SelectionSort");
        
        int [] elementos2 = {6,5,4,3,2,1,7};
        MinhaLista lista2 = new MinhaLista(elementos2);
        lista2.setOrdenacaoStrategy(new SelectionSortStrategy());
        lista2.ordenar(); // ordena lista usando Selection Sort
        lista2.print(); 
        
        System.out.println("\nLista #3 foi ordenada com a estratégia: InsertionSort");
        
        int [] elementos3 = {7,8,9,4,5,6,1,2,3};
        MinhaLista lista3 = new MinhaLista(elementos3);
        lista3.setOrdenacaoStrategy(new InsertionSortStrategy());
        lista3.ordenar(); // ordena lista usando Insertion Sort
        lista3.print(); 


        System.out.println("\nLista #4 foi ordenada com a estratégia: MergeSort");
        int [] elementos4 = {3,2,1,6,5,4,9,8,7};
        MinhaLista lista4 = new MinhaLista(elementos4);
        lista4.setOrdenacaoStrategy(new MergeSortStrategy());
        lista4.ordenar(); // ordena lista usando Merge Sort
        lista4.print();        
             
      }

}
