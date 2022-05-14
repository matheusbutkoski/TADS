#include <stdio.h>
#include <stdlib.h>

int main(){

struct data{
    int dia, mes, ano;
};
struct funcionario{

    char nome[40];
    int idade;
    char sexo;
    char cpf[17];
    struct data dd;
    int codigoSetor;
    char cargo[30];
    float salario;

}func;

fflush(stdin);
printf("Informe o Nome do Funcionario\n");
gets(func.nome);
fflush(stdin);

printf("Informe a idade\n");
scanf("%i", &func.idade);

printf("Informe o sexo do funcionario M/F\n");
scanf("%s", &func.sexo);

fflush(stdin);
printf("Informe o CPF\n");
gets(func.cpf);
fflush(stdin);

printf("Informe Data de Nascimento\n");

scanf("%i", &func.dd.dia);
scanf("%i", &func.dd.mes);
scanf("%i", &func.dd.ano);

printf("Informe Codigo do Setor\n");
scanf("%i", &func.codigoSetor);

fflush(stdin);
printf("Informe o Cargo\n");
gets(func.cargo);
fflush(stdin);

printf("Informe o Salario\n");
scanf("%f", &func.salario);

printf("\n");
printf("-----------------\n");
printf("Nome: %s\n", func.nome);
printf("Idade: %i\n", func.idade);
printf("Sexo: %c\n", func.sexo);
printf("CPF:  %s\n", func.cpf);
printf("Data de Nascimento: %i/%i/%i\n", func.dd.dia, func.dd.mes, func.dd.ano);
printf("Codigo do Setor: %i\n", func.codigoSetor);
printf("Cargo: %s\n", func.cargo);
printf("Salario: R$ %f\n", func.salario);

system("pause");
}



