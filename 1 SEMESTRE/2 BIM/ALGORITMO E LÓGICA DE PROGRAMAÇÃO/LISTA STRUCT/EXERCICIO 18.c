#include <stdio.h>
#include <stdlib.h>

int main(){

int i;
struct proprietario{

    long int cpf[15];
    char nome[30];

};
struct infoCarro{

    char modelo[15];
    int ano;
    char placa[10];
    struct proprietario prop

}carro[5];
printf("Informe os dados dos carros:\n");
for(i=0;i<5;i++){

    printf("Modelo:\n");
    fflush(stdin);
    gets(carro[i].modelo);

    printf("Ano:\n");
    scanf("%i", &carro[i].ano);

    printf("Placa:\n");
    fflush(stdin);
    gets(carro[i].placa);

    printf("Nome do Proprietario:\n");
    fflush(stdin);
    gets(carro[i].prop.nome);

    printf("CPF do Proprietario:\n");
    fflush(stdin);
    gets(carro[i].prop.cpf);
}
 printf("-----------------\n");
for(i=0;i<5;i++){
 printf("Modelo: %s\n", carro[i].modelo);
 printf("Ano: %i\n", carro[i].ano);
 printf("Placa: %s\n", carro[i].placa);
 printf("Nome do Proprietario: %s\n", carro[i].prop.nome);
 printf("CPF do Proprietario: %s\n ", carro[i].prop.cpf);
 printf("-----------------\n");
}
system("pause");
}
