#include <stdio.h>
#include <stdlib.h>

int main(){
int i;

struct infos{

    char nome[20];
    char estilo[20];
    int numInt;
    int rank;


}bandas[3];



for(i=0;i<3;i++){
fflush(stdin);
printf("Informe o Nome da Banda\n");
gets(bandas[i].nome);
fflush(stdin);

printf("Informe o Estilo Musical da Banda\n");
gets(bandas[i].estilo);
fflush(stdin);

printf("Informe o Numero de Integrantes\n");
scanf("%i", &bandas[i].numInt);

printf("Informe o Numero no Ranking de 1 a 5\n");
scanf("%i", &bandas[i].rank);
}

for(i=0;i<5;i++){

if(bandas[i].rank == 1){

    printf("-------------------\n");
    printf("Numero no Ranking: %i\n", bandas[i].rank);
    printf("Nome: %s\n", bandas[i].nome);
    printf("Estilo: %s\n", bandas[i].estilo);
    printf("Numero de Integrantes: %i\n", bandas[i].numInt);
}
if(bandas[i].rank == 2){

    printf("-------------------\n");
    printf("Numero no Ranking: %i\n", bandas[i].rank);
    printf("Nome: %s\n", bandas[i].nome);
    printf("Estilo: %s\n", bandas[i].estilo);
    printf("Numero de Integrantes: %i\n", bandas[i].numInt);
}
if(bandas[i].rank == 3){

    printf("-------------------\n");
    printf("Numero no Ranking: %i\n", bandas[i].rank);
    printf("Nome: %s\n", bandas[i].nome);
    printf("Estilo: %s\n", bandas[i].estilo);
    printf("Numero de Integrantes: %i\n", bandas[i].numInt);
}
if(bandas[i].rank == 4){

    printf("-------------------\n");
    printf("Numero no Ranking: %i\n", bandas[i].rank);
    printf("Nome: %s\n", bandas[i].nome);
    printf("Estilo: %s\n", bandas[i].estilo);
    printf("Numero de Integrantes: %i\n", bandas[i].numInt);
}
if(bandas[i].rank == 5){

    printf("-------------------\n");
    printf("Numero no Ranking: %i\n", bandas[i].rank);
    printf("Nome: %s\n", bandas[i].nome);
    printf("Estilo: %s\n", bandas[i].estilo);
    printf("Numero de Integrantes: %i\n", bandas[i].numInt);
}

}
system("pause");
}
