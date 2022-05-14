#include <stdio.h>
#include <stdlib.h>


int main (){

int vet1[5], vet2[5], vet3[5], i;

printf ("Preencha o primeiro vetor\n");

for(i=0;i<5;i++){
    scanf("%i", &vet1[i]);
}

printf ("Preencha o segundo vetor\n");

for(i=0;i<5;i++){
    scanf("%i", &vet2[i]);
}

for(i=0;i<5;i++){

vet3[i] = vet1[i] + vet2[i];
}
for(i=0;i<5;i++){
printf ("%i  ", vet3[i]);
}
system("pause");
}
