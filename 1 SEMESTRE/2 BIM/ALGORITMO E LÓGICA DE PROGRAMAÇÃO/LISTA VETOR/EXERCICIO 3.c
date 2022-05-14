#include <stdio.h>
#include <stdlib.h>


int main (){

int i, vet[8];

printf ("Preencha o vetor de 8 posições para ver a ordem reversa\n");

for(i=0;i<8;i++){
    scanf("%i", &vet[i]);
}

for(i=0;i<8;i++){
    printf("%i  ", vet[7-i]);
}


system("pause");
}
