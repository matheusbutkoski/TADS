#include <stdio.h>
#include <stdlib.h>


int main(){

int *x,i;

x = (int *) malloc(5 * sizeof(int));

if (x == NULL){
    printf("Erro de Alocacao");
    exit(1);
}

for(i=0;i<5;i++){
    printf("Informe posicao x[%d]: ", i);
    scanf("%d", &x[i]);
}

for(i=0;i<5;i++){
    printf("%5d", x[i]);
}

free(x);

}
