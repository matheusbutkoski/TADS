#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct jogador{//global
    char nome[30], posicao[20];
    int idade, n_camisa;
}titular[6], reserva[4],aux;

int cadastra_titular(){
    int i;
    for(i=0;i<6;i++){
        printf("Informe nome\n");
        gets(titular[i].nome);
        fflush(stdin);
        printf("Informe posicao\n");
        gets(titular[i].posicao);
        fflush(stdin);
        printf("Informe idade\n");
        scanf("%i",&titular[i].idade);
        fflush(stdin);
        printf("Informe numero camisa\n");
        scanf("%i",&titular[i].n_camisa);
        fflush(stdin);
    }
}
int cadastra_reserva(){
    int i;
    for(i=0;i<4;i++){
        printf("Informe nome\n");
        gets(reserva[i].nome);
        fflush(stdin);
        printf("Informe posicao\n");
        gets(reserva[i].posicao);
        fflush(stdin);
        printf("Informe idade\n");
        scanf("%i",&reserva[i].idade);
        fflush(stdin);
        printf("Informe numero camisa\n");
        scanf("%i",&reserva[i].n_camisa);
        fflush(stdin);
    }
}
int ordena_titular(){
    int i,cont=0;
    do{
        cont=0;
        for(i=0;i<6;i++){
            if(titular[i].n_camisa > titular[i+1].n_camisa){
                aux.n_camisa = titular[i].n_camisa;
                aux.idade = titular[i].idade;
                strcpy(aux.nome, titular[i].nome);
                strcpy(aux.posicao, titular[i].posicao);

                titular[i].n_camisa = titular[i+1].n_camisa;
                titular[i].idade = titular[i+1].idade;
                strcpy(titular[i].nome, titular[i+1].nome);
                strcpy(titular[i].posicao, titular[i+1].posicao);

                titular[i+1].n_camisa = aux.n_camisa;
                titular[i+1].idade = aux.idade;
                strcpy(titular[i+1].nome, aux.nome);
                strcpy(titular[i+1].posicao, aux.posicao);
                cont++;
            }
        }
    }while(cont !=0 );
    for(i=0;i<6;i++){
        printf("Numero da Camisa: %i\n", titular[i].n_camisa);
        printf("Nome: %s\n", titular[i].nome);
        printf("Idade: %i\n", titular[i].idade);
        printf("Posicao: %s\n", titular[i].posicao);
    }
}

int main(){
    int op;
    printf("Quais jogadores deseja cadastrar?\n");
    printf("1 - Titular\n2- Reserva\n");
    scanf("%i",&op);
    switch (op){
    case 1:
        cadastra_titular();
        break;
    case 2:
        cadastra_reserva();
        break;
    }
    ordena_titular();

    system("pause");
}
