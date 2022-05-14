#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main(){

int i, j;
char nomeDir[20];

struct infofilmes{

    char nomeFil[20];
    int ano;
    char duracao[15];
};
struct infos{

    char nome[20];
    int qtdFil;
    struct infofilmes fil;


}diretor[2];

for(i=0;i<2;i++){

    printf("Informe o Nome do Diretor:\n");
    fflush(stdin);
    gets(diretor[i].nome);

    printf("Informe a Quantidade de Filmes produzidos:\n");
    scanf("%i", &diretor[i].qtdFil);

    printf("Informe os Filmes Produzidos pelo Diretor:\n");
    for(j=0;j<diretor[i].qtdFil;j++){

    printf("Nome do Filme:\n");
    fflush(stdin);
    gets(diretor[j].fil.nomeFil);

    printf("Informe o Ano de Lançamento do Filme:\n");
    scanf("%i", &diretor[j].fil.ano);

     printf("Informe a Duração do Filme:\n");
     fflush(stdin);
        gets(diretor[j].fil.duracao);

        }
}

do{
printf("Informe qual Diretor deseja consultar:\n");
fflush(stdin);
gets(nomeDir);
printf("---------------------\n");
for(i=0;i<2;i++){
if (strcmp(diretor[i].nome,nomeDir)){
}
else{
 printf("Filmes de %s:\n", diretor[i].nome);

     for(j=0;j<diretor[i].qtdFil;j++){
    printf("Nome: %s\n", diretor[j].fil.nomeFil);
    printf("Ano: %d\n", diretor[j].fil.ano);
    printf("Duracao: %s\n", diretor[j].fil.duracao);
    printf("---------------------\n");

}
}

}

}while(nomeDir != "");
system("pause");
}
