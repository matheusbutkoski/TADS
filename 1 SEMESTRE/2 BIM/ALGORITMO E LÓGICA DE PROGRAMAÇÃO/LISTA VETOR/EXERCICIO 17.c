#include <stdio.h>
#include <stdlib.h>


int main (){

int i, vet[10], j;

printf("Informe 10 numeros\n");

for(i=0;i<10;i++){
scanf("%i", &vet[i]);
}

for(i=0;i<10;i++){
    for(j=i+1; j<10; j++){
    if(vet[i] <= vet[j]){
        printf ("%i ", vet[i]);
    }
  }
}
system ("pause");
}
