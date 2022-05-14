#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main (){

int vet[20], i;

srand(time(NULL));

for(i=0;i<20;i++){
    vet[i] = 1+rand()%99;
}
printf("Vetor Original\n");

for(i=0;i<20;i++){
printf ("%i ", vet[i]);
}
printf("\n");

printf("Vetor alterado\n");
for(i=0;i<20;i++){
    vet[i] = vet[20-i];
}

for(i=0;i<20;i++){
printf ("%i ", vet[i]);
}
printf("\n");





system ("pause");
}
