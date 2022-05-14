#include <stdio.h>
#include <stdlib.h>

int main(){

struct info{
    char nome[20];
    char areadeatuacao[20];
    float valoratual;
    float valorantigo;
    double variacao;
}acao[3];

    int i;
    for(i=0; i<3; i++){
        fflush(stdin);
        printf("Digite o Nome da Companhia\n");
        gets(acao[i].nome);
        fflush(stdin);

        printf("Digite a Area de Atuacao\n");
        gets(acao[i].areadeatuacao);
        fflush(stdin);

        printf("Digite o Valor Atual da Acao\n");
        scanf("%f", &acao[i].valoratual);

        printf("Digite o Valor Antigo da Acao\n");
        scanf("%f", &acao[i].valorantigo);

        acao[i].variacao = (double)((acao[i].valoratual-acao[i].valorantigo)/acao[i].valorantigo)*100;
    }
     printf("-------------------------------\n");
    for(i=0; i<3; i++){
        printf("Nome: %s\n", acao[i].nome);
        printf("Area de Atuacao: %s\n", acao[i].areadeatuacao);
        printf("O Valor Atual da Acao eh: %.2f\%\n", acao[i].valoratual);
        printf("O Valor Antigo da Acao era: %.2f%\n", acao[i].valorantigo);
        printf("A Variacao foi de: %.2lf%%\n ", acao[i].variacao);
        printf("-------------------------------\n");
    }

    system("pause");
}
