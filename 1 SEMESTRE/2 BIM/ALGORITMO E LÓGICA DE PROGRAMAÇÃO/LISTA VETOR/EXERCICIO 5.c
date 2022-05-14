#include <stdio.h>
#include <stdlib.h>


int main (){

int vet[5], i, soma=0;

printf ("Informe 5 valores\n");

for (i=0; i<5; i++){
 scanf("%i", &vet[i]);
 soma = soma + vet[i];
}

printf ("A soma de todos os valores eh %i\n", soma);







system("pause");
}
