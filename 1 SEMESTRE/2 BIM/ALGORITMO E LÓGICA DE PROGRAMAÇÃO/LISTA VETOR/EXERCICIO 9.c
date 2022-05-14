#include <stdio.h>
#include <stdlib.h>

int main (){

int i, vet[5], cod;

printf ("Preencha o vetor de 5 posicoes\n");

for(i=0;i<5;i++){
    scanf("%i", &vet[i]);
}

printf ("Informe o codigo desejado 0/1/2\n");
scanf("%i", &cod);


if (cod != 0 || cod!= 1 || cod != 2){
    printf ("Codigo invalido\n");
    printf ("Digite um codigo valido\n");
    scanf("%i", &cod);
}

if(cod == 0){
    system("pause");
}

if(cod == 1){
    for(i=0;i<5;i++){
    printf("%i  ", vet[i]);
}
}

if (cod == 2){
    for(i=0;i<5;i++){
    printf("%i  ", vet[4-i]);
}

}





system("pause");
}
