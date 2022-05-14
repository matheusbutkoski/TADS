#include <stdio.h>
#include <stdlib.h>

int main(){

int qtdp,codp, i;


struct ped{

    int codigo;
    char nome[15];
    float preco;
    int qtd;
    }produto[5];

printf("Registre 5 Produtos:\n");

for(i=0;i<5;i++){
printf("Informe o Codigo do Produto\n");
scanf("%i", &produto[i].codigo);

fflush(stdin);
printf("Informe o Nome do Produto\n");
gets(produto[i].nome);
fflush(stdin);

printf("Informe o Preco do produto\n");
scanf("%f", &produto[i].preco);

printf("Informe o Estoque Atual do Produto\n");
scanf("%i", &produto[i].qtd);
}


do{
printf("Informe o codigo do produto do pedido\n");
scanf("%i", &codp);

printf("Informe a quantidade de itens no pedido\n");
scanf("%i", &qtdp);

for(i=0;i<5;i++){
    if(produto[i].codigo == codp && produto[i].qtd >= qtdp ){
            printf("Pedido feito com sucesso!\n");
            printf("Estoque atual do produto: %i unidades\n", produto[i].codigo, produto[i].qtd - qtdp );
            }
     if(produto[i].codigo == codp && produto[i].qtd < qtdp){
            printf("Estoque Insuficiente!\n");
        }
}
}while(codp != 0);
system("pause");
}
