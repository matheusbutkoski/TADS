
import strategy.java.atividade_estrategia_de_ordenacao.strategy.OrdenacaoStrategy;

public class InsertionSortStrategy extends OrdenacaoStrategy {
    public void ordenar(int[] elementos) {
        for (int i = 1; i < elementos.length; i++) { 
            
            int j = i;
        
            while (j > 0 && elementos[j] < elementos[j-1]) {
                int aux = elementos[j];
                elementos[j] = elementos[j - 1];
                elementos[j - 1] = aux;
                j -= 1;
            }
        
        }	
    }
}
