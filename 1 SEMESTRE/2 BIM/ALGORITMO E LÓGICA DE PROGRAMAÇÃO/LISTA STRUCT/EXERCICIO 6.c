#include <stdio.h>
#include <stdlib.h>

int main(){

int i, valor;

struct info{

char marca[15];
int ano;
int preco;

}carro[5];


for(i=0;i<5;i++){
fflush(stdin);
printf("Informe a marca do Carro %i \n", i);
gets(carro[i].marca);
fflush(stdin);

printf("Informe o ano do Carro %i\n", i);
scanf("%i", &carro[i].ano);

printf("Informe o preco do Carro %i\n", i);
scanf("%i", &carro[i].preco);
}

do{
printf("Informe o valor que deseja filtrar os carros\n");
scanf("%i", &valor);
printf("Carros com valores menores que o informado:\n");
printf("-----------------\n");

for(i=0;i<5;i++){

if(carro[i].preco < valor){

    printf("Marca: %s\n", carro[i].marca);
    printf("Ano: %i\n", carro[i].ano);
    printf("Preco: R$ %i\n", carro[i].preco);
    printf("-----------------\n");
}
}
}while(valor != 0);
system("pause");
}
