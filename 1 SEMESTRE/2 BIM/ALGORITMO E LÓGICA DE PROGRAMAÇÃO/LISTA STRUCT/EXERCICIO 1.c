#include <stdio.h>
#include <stdlib.h>

int main(){

    struct aluno{
        int matricula;
        char nome[30], cod_disc[10];
        float n1, n2, media;

}al[10];
    int i, cont=0;

    printf("Preencha os 10 cadastros\n");
    for(i=0; i < 10; i++){

        fflush(stdin);
        al[i].matricula = ++cont;
        fflush(stdin);

        printf("Nome:\n");
        gets(al[i].nome);
        fflush(stdin);

        printf("Codigo Disciplina\n");
        gets(al[i].cod_disc);

        printf("Nota 1\n");
        scanf("%f", &al[i].n1);

        printf("Nota 2\n");
        scanf("%f", &al[i].n2);

        al[i].media = (al[i].n1*1 + al[i].n2*2)/3;
    }
     printf("Preencha os 10 cadastros\n");

    for(i=0; i < 10; i++){

        printf("Matricula: %i\n", al[i].matricula);
        printf("Nome: %s\n", al[i].nome);
        printf("Codigo Disciplina %s\n", al[i].cod_disc);
        printf("Media %f\n", al[i].media);
    }
    system("pause");

}
