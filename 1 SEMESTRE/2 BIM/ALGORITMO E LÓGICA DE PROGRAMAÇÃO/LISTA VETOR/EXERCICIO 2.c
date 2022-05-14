#include <stdio.h>
#include <stdlib.h>


int main (){

int vetA[5], vetB[5], vetC[5], i;

printf ("Preencha o primeiro vetor\n");

for(i=0;i<5;i++){
    scanf("%i", &vetA[i]);
}

printf ("Preencha o segundo vetor\n");

for(i=0;i<5;i++){
    scanf("%i", &vetB[i]);
}

for(i=0;i<5;i++){

    if(vetA[i] > vetB[i]){
        vetC[i] = 1;

    }else if (vetA[i] == vetB[i]){
        vetC[i] = 0;

    }else if (vetA[i] < vetB[i]){
        vetC[i] = -1;
}
}
for(i=0;i<5;i++){
        printf("%i  ", vetC[i]);
}


printf ("\n");
system("pause");
}
