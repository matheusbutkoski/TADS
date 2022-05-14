#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main(){

int i, j, esc, x=0;
char op;

struct aluno{

    char nome[50];
    int ra;

}dados[100];

for(j=0; j=1; j++){
printf("Escolha o que deseja fazer\n");
printf("1 - Cadastrar Aluno\n");
printf("2 - Pesquisar Aluno pelo RA\n");
printf("3 - Listar todos os alunos cadastrados\n");
printf("4 - Editar registro de aluno\n");
printf("5 - Sair\n");
scanf("%i", &esc);



if (esc==1){

        for(i=0; i<100; i++){
        printf("Informe o Nome do Aluno\n");
        fflush(stdin);
        gets(dados[i].nome);
        fflush(stdin);


        printf("Informe o RA do Aluno\n");
        scanf("%i", &dados[i].ra);

         fflush(stdin);
        printf("Aluno Cadastrado!\n");
        printf("-------------------\n");
        x++;
        printf("Deseja cadastrar outro aluno? S/N\n");
        scanf("%s", &op);

        if(op != 'S'){

        j=1;
        }
        }
            }

if (esc==2){

   int pesq, cont=0;

    printf("Informe o RA que deseja procurar\n");
    scanf("%i", &pesq);

    for(i=0;i<100;i++){


   if(pesq == dados[i].ra){
        printf("-------------------\n");
        printf("Aluno Encontrado!\n");
        printf("Nome: %s\n", dados[i].nome);
        printf("RA: %i\n", dados[i].ra);
        printf("-------------------\n");

}
}
}

if (esc==3){
        printf("-------------------\n");
        for(i=0;i<x;i++){

        printf("Nome: %s\n", dados[i].nome);
        printf("RA: %i\n", dados[i].ra);
        printf("-------------------\n");
}
}

if (esc==4){
    int edit, era;
    char enome[50];
        printf("Informe o RA do aluno que deseja editar\n");
        scanf("%i", &edit);

        for(i=0; i<100; i++){
        if(edit == dados[i].ra){
        printf("-------------------\n");
        printf("Aluno Encontrado!\n");
        printf("Nome: %s\n", dados[i].nome);
        printf("RA: %i\n", dados[i].ra);
        printf("-------------------\n");

        printf("Digite o novo NOME\n");
        fflush(stdin);
        gets(dados[i].nome);

        printf("Digite o novo RA\n");
        scanf("%i", &era);
        dados[i].ra = era;
        printf("Edicao Concluida\n");
        break;
}
}


}
if (esc==5){

system("pause");
break;
}
}
}

