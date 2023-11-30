package modelo;

import java.util.Arrays;

import strategy.BubbleSortStrategy;
import strategy.OrdenacaoStrategy;

public class MinhaLista {
     
    private int [] elementos;
    
    private OrdenacaoStrategy strategy;  // estratégia de ordenação
    
    public MinhaLista(int [] elementos) {
        this.elementos = elementos;
        strategy = new BubbleSortStrategy(); // estratégia default: BubbleSort
    }
    
    public void setOrdenacaoStrategy(OrdenacaoStrategy strategy) {
        this.strategy = strategy;  // permite mudar estratégia de ordenação
    }
    
    public void ordenar() {
        strategy.ordenar(elementos);
    }
    
    public void print() {
        System.out.println(Arrays.toString(elementos));
    }
    
}