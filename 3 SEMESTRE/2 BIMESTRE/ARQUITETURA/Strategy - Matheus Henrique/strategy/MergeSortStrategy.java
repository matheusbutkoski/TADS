package strategy;

public class MergeSortStrategy extends OrdenacaoStrategy {
    public void ordenar(int[] elementos) {
        int n = elementos.length;  
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = elementos[i];
                int j = i;
                while (j >= gap && elementos[j - gap] > key) {
                    elementos[j] = elementos[j - gap];
                    j -= gap;
                }
                elementos[j] = key;
            }
        }
    }
}
