#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
int n, vet[100], i;

printf("Quantos numeros inteiros deseja?\n");
scanf("%i", &n);

FILE * arq;
arq = fopen("randomico.txt", "w");

srand(time(NULL));

fprintf(arq,"Quantidade de Numeros: %i\n", n);

for(i=0; i < n; i++){

    vet[i] = 1+rand()%100;
    fprintf(arq,"%i, ", vet[i]);

}
printf("\n");
fclose(arq);
system("pause");
}
