#include <stdio.h>
#include <stdlib.h>

int main(){

int i, j;
char nome[30];

struct info{

    char titulo[30];
    char autor[15];
    int ano;
}livro[5];

for(i=0;i<5;i++){

    fflush(stdin);
    printf("Informe o Titulo do Livro %i\n", i);
    gets(livro[i].titulo);
    fflush(stdin);

    printf("Informe o Autor do Livro %i\n", i);
    gets(livro[i].autor);
    fflush(stdin);

    printf("Informe o Ano de Publicacao do Livro %i\n", i);
    scanf("%i", &livro[i].ano);
}

fflush(stdin);
printf("Informe o titulo do livro que deseja buscar\n");
gets(nome);
fflush(stdin);
printf("-----------------\n");

    for(i=0;i<30;i++){

   if(nome[i] == livro[i].titulo[i]){

    printf("Titulo: %s\n", livro[i].titulo);
    printf("Autor: %s\n", livro[i].autor);
    printf("Ano: %i\n", livro[i].ano);
    printf("-----------------\n");
   }
}
system("pause");
}
