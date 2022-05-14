#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main(){


int i, y,*x, contp=0, conti=0;

printf("Informe o tamanho do Vetor\n");
scanf("%i", &y);

x = (int *) malloc(y * sizeof(int));

for(i=0;i<y;i++){
    printf("Informe posicao x[%d]: ", i);
    scanf("%d", &x[i]);

    if(x[i] % 2 == 0){
        contp++;
    }else{
        conti++;
    }
}
printf("Quantidade de numeros pares %i\n", contp);
printf("Quantidade de numeros impares %i\n", conti);

}
