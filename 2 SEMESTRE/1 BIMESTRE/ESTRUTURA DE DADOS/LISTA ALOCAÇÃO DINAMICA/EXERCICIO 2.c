#include <stdio.h>
#include <stdlib.h>

int main(){

int i, y,*x;

printf("Informe o tamanho do Vetor\n");
scanf("%i", &y);

x = (int *) malloc(y * sizeof(int));

for(i=0;i<y;i++){
    printf("Informe posicao x[%d]: ", i);
    scanf("%d", &x[i]);
}

for(i=0;i<y;i++){
    printf("%5d", x[i]);
}

free(x);





}
