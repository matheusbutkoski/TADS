package controle;

public class Calcula {
    
    public static double media(int[] valores){
        if(valores == null || valores.length == 0){
            return 0;
        }
        
        int soma = 0;
        
        for (int i = 0; i < valores.length; i++) {
             soma+= valores[i];
        }
        return soma/(double)valores.length;
    }
}
