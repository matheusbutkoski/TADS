#include <stdio.h>
#include <stdlib.h>

int main(){

int i, media=0, vet[12];

FILE *arq;
arq = fopen("idade.txt", "r");


for(i=0;i<12;i++){

vet[i]=0;

fscanf(arq,"%i", &vet[i]);
media = media + vet[i];
}
printf("A media das idades eh de: %i\n", media / 12);
fclose(arq);
system("pause");
}
