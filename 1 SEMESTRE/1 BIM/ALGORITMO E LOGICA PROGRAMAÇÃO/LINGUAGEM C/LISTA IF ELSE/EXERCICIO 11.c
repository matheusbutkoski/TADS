#include <stdio.h>
#include <stdlib.h>

int main (){
int ele_apto, votos, p;
    printf("Informe o numero de eleitores\n");
     scanf("%i", &ele_apto);
       if (ele_apto >= 20000){
        printf ("Informe o numero de votos do candidato mais votado\n");
        scanf ("%i", &votos);
        p = ele_apto * 0.5;

            if (votos < p){
             printf ("Havera segundo turno\n");
            }else{
             printf ("Nao havera segundo turno\n");
            }

        }else{
         printf ("Quantidade de eleitores aptos insuficiente para segundo turno\n");
        }
    system ("pause");


}
