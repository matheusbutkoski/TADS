package lista.java;
public class Ex7 {
    public static void main(String[] args){
        int[][] mat = new int[5][5];
        int[] somaColuna = new int[5];
        int i, j, aux=1, somaVal=0, somaAcima=0, col=1;
        
        for(i=0;i<5;i++){
            if(i % 2 == 0){
            for(j=0;j<5;j++){
                mat[i][j] = aux;
                aux++;
                somaVal += mat[i][j];
            }
            }else{
                for(j=4;j>=0;j--){
                mat[i][j] = aux;
                aux++;
                somaVal += mat[i][j];
            }
            
            }
        }
        
        for(j=0; j<5; j++){
            for(i=0; i<5; i++){               
                somaColuna[j] += mat[i][j];
            }
        }
        
        
        
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.format("%d ",mat[i][j]);
            }
            System.out.println();
        }
        
         for(i=0;i<5;i++){
            for(j=0;j<5;j++){
               if(j>i){
                   somaAcima = somaAcima + mat[i][j];
               }
            }
        }
        
       
        System.out.println("------------------------");
        System.out.println("Soma dos valores da matriz: "+somaVal);
        System.out.println("Soma dos valores acima da diagonal: "+somaAcima);
        System.out.println("------------------------");
        for(i=0; i<5; i++){           
            System.out.format("Soma da coluna %d: %d \n",col,somaColuna[i]);
            col++;
        }
        System.out.println("------------------------");
        System.out.println("Matriz Transposta");
         for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.format("%d ",mat[j][i]);
            }
            System.out.println();
        }
        
    }
}
