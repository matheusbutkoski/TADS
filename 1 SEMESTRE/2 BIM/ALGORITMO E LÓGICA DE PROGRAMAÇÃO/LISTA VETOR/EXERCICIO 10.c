#include <stdio.h>
#include <stdlib.h>



int main(){

int vet[100];
int i, n;

printf("Informe um valor\n");
scanf("%i", &n);

vet[0] = n;

for(i=0;i<50;i++){
    vet[i+1] = vet[i]/2;
    }


for(i=0;i<10;i++){
    printf("%d ", vet[i]);
}




system("pause");
}
