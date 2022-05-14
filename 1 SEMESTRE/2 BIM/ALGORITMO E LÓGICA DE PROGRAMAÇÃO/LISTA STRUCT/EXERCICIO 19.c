#include <stdio.h>
#include <stdlib.h>

int main(){

struct professor{

    char cpf[15];
    char nome[30];
};

struct disciplina{

    int codigo;
    char nome[30];
    struct professor prof;
};

struct al{

    int matricula;
    char nome[30];
    struct disciplina dis;

}aluno[3];

for(int i = 0; i < 3; i++){
    fflush(stdin);
    printf("Informe o Nome do Aluno\n");
    gets(aluno[i].nome);
    printf("Informe a Matricula do Aluno\n");
    scanf("%d",&aluno[i].matricula);

    printf("Informe o Nome da Disciplina\n");
    fflush(stdin);
    gets(aluno[i].dis.nome);
    printf("Informe o Codigo da Disciplina\n");
    scanf("%d",&aluno[i].dis.codigo);

    printf("Informe o Nome do Professor\n");
    fflush(stdin);
    gets(aluno[i].dis.prof.nome);
    printf("Informe o CPF do Professor\n");
    fflush(stdin);
    gets(aluno[i].dis.prof.cpf);
}
printf("-------------------------\n");
for(int i = 0; i < 3; i++){
    printf("Nome do Aluno: %s\n", aluno[i].nome);
    printf("Matricula do Aluno: %i\n", aluno[i].matricula);
    printf("Nome da Disciplina: %s\n", aluno[i].dis.nome);
    printf("Codigo da Disciplina: %i\n", aluno[i].dis.codigo);
    printf("Nome do Professor: %s\n", aluno[i].dis.prof.nome);
    printf("CPF do Professor: %s\n", aluno[i].dis.prof.cpf);
    printf("-------------------------\n");

}
system("pause");
}
