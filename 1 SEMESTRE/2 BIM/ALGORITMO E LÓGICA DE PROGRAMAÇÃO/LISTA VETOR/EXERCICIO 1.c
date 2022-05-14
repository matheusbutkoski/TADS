#include <stdlib.h>
#include <stdio.h>

int main (){

int i, vet[8], x, y, soma=0;

printf ("Informe as posicoes x e y (intervalo de 0 a 7\n");
scanf("%i%i", &x, &y);

printf ("Preencha o vetor de 8 posicoes\n");
for (i=0; i<8; i++){
    scanf ("%i", &vet[i]);
}
soma = vet[x] + vet[y];
printf ("A soma das posicoes x e y eh %i\n", soma);


system ("pause");
}
