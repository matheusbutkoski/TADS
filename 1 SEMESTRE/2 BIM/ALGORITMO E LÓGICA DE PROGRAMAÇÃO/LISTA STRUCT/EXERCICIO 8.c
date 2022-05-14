#include <stdio.h>
#include <stdlib.h>

int main(){

int i;

struct endereco{
    char logradouro[30];
    int numero;
    char bairro[20];
    long int cep;

};

struct cliente{
    int matricula;
    char nome[30];
    struct endereco end;

};
struct infos{

struct cliente cli;

}cadastro[3];

for(i=0;i<3;i++){

fflush(stdin);
printf("Informe o nome do cliente\n");
gets(cadastro[i].cli.nome);
fflush(stdin);

printf("Informe a matricula do cliente\n");
scanf("%i", &cadastro[i].cli.matricula);


fflush(stdin);
printf("Informe o logradouro\n");
gets(cadastro[i].cli.end.logradouro);
fflush(stdin);

printf("Informe o numero\n");
scanf("%i", &cadastro[i].cli.end.numero);

fflush(stdin);
printf("Informe o bairro\n");
gets(cadastro[i].cli.end.bairro);
fflush(stdin);

printf("Informe o CEP\n");
scanf("%i", &cadastro[i].cli.end.cep);
}

printf("------------------\n");
for(i=0;i<3;i++){

printf("Nome: %s\n", cadastro[i].cli.nome);
printf("Matricula: %i\n", cadastro[i].cli.matricula);
printf("Logradouro: %s\n", cadastro[i].cli.end.logradouro);
printf("Numero: %i\n", cadastro[i].cli.end.numero);
printf("Bairro: %s\n", cadastro[i].cli.end.bairro);
printf("CEP: %i\n", cadastro[i].cli.end.cep);
printf("------------------\n");

}

system("pause");
}
