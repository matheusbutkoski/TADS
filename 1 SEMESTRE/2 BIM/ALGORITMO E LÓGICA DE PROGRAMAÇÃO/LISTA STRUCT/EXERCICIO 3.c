#include <stdio.h>
#include <stdlib.h>

int main (){

int i;

struct aluno{

    char nome[40];
    int matricula;
    char nomeCurso[40];


}al[5];

for(i=0; i < 5; i++){
    fflush(stdin);
    printf("Informe o nome do aluno\n");
    gets(al[i].nome);
    fflush(stdin);

    printf("Informe a matricula do aluno\n");
    scanf("%i", &al[i].matricula);

    fflush(stdin);
    printf("Informe o nome do curso\n");
    gets(al[i].nomeCurso);
    fflush(stdin);
}

for(i=0;i<5;i++){
printf("Nome: %s\n", al[i].nome);
printf("Matricula: %i\n", al[i].matricula);
printf("Curso: %s\n", al[i].nomeCurso);
printf("----------------------\n");
}

system("pause");
}
