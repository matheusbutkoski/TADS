#include<stdio.h>
#include<stdlib.h>

struct  Node{//criando o tipo do elemento da lista
    int num;//dado
    struct Node *prox;
};
typedef struct Node node;//apelido
typedef node *LISTA;//declara��o ponteiro da cabe�a da lista


LISTA* criarLista(){
    LISTA *li =(LISTA*) malloc (sizeof(LISTA));//aloca cabe�a da lista
    if(li != NULL){
        *li=NULL;
    }else{
        printf("Erro na aloca��o...\n");
        exit(0);
    }
    return li;
}

int insereOrdenado(LISTA* lista, int i){
	int cont=0;
	node *ant;
	node *novo=(node *) malloc(sizeof(node));
	if(novo == NULL){//testa se aloca��o ocorreu
		printf("Erro na alocacao!\n");
		exit(0);
	}
	novo->num = i;
	novo->prox = NULL;
	if((*lista) == NULL){//se lista est� vazia...insere no come�o
		*lista=novo;
	}else{
		node *tmp = *lista;//cria auxiliar
		while(tmp->prox != NULL && tmp->num <= novo->num){//percorre at� o ultimo elemento da lista ou
			ant = tmp;   //guarda anterior                //at� encontrar numero maior que oque ser� inserido
			tmp = tmp->prox; //avan�a
			cont++;
		}
		if (cont == 0 && tmp->num > novo->num){//testa se unico elemento e valor menor a ser inserido
			ant = *lista;
			*lista = novo;
			novo->prox = ant;
		}else if (cont == 0 && tmp->num < novo->num){//testa se unico elemento e valor maior a ser inserido
			tmp->prox=novo;
		}else if(tmp->num >= novo->num){
			ant->prox = novo;
			novo->prox = tmp;
		}else{//o maior numero ser� inserido no final da lista
			tmp->prox = novo;//fim velho recebe fim novo
		}
	}
}

int removeOrdenado (LISTA* lista){
	int p;
	printf("qual numero quer remover?\n");
	scanf("%d", &p);
	node *ant, *tmp;
	ant = *lista;
	tmp = *lista;
	if((*lista) != NULL && tmp->num == p){//remove no inicio
		*lista = tmp->prox;
		free(tmp);
		printf("Elemento removido com sucesso...\n");
	}else if((*lista) != NULL){
		while (tmp->prox !=NULL && tmp->num != p){ //enquanto n�o for fim da lista ou n�o achar o numero
			ant = tmp;
			tmp = tmp->prox;
		}
		if(tmp->num == p){//se achou o numero /*alterada condi��o*/
			ant->prox = tmp->prox;
			free(tmp);
			printf("Elemento removido com sucesso...\n");/*alterada de lugar*/
		}else{//se fim da lista
			printf("Elemento nao encontrado\n");
		}
	}else{
		printf("Lista ja esta vazia... \n");
	}
}

int procuraValor (LISTA* lista){
	int p, cont, op;

	do{
    cont=0;
	printf("qual numero quer procurar na lista?\n");
	scanf("%d", &p);
	node *ant, *tmp;
	ant = *lista;
	tmp = *lista;
	if((*lista) != NULL && tmp->num == p){//remove no inicio
		*lista = tmp->prox;
		free(tmp);
        cont++;
        printf("---------------------------------------------------------------------\n");
		printf("Foram percorridos %i elementos a direita para encontra o numero %i\n", cont, p);
		printf("---------------------------------------------------------------------\n");
	}else if((*lista) != NULL){
		while (tmp->prox !=NULL && tmp->num != p){ //enquanto n�o for fim da lista ou n�o achar o numero
			ant = tmp;
			tmp = tmp->prox;
			cont++;
		}
		printf("---------------------------------------------------------------------\n");
		printf("Foram percorridos %i elementos a direita para encontra o numero %i\n", cont, p);
		printf("---------------------------------------------------------------------\n");
	}else{
		printf("Lista ja esta vazia... \n");
	}
	printf("Deseja procurar outro elemento Sim=1/Nao=2\n");
	scanf("%i", &op);
	}while(op != 2);
}


void exibe(LISTA* lista){
    if( (*lista) == NULL){
        printf("LISTA VAZIA...\n");
    }else{
        node *tmp;// no tempor�rio
        tmp = (*lista);
        while (tmp != NULL){
            printf("%5d", tmp->num);
            tmp = tmp->prox;
        }
    }
    printf("\n");

    }

void libera(LISTA* lista){
    if((*lista) == NULL){
        printf("LISTA VAZIA...\n");
    }else{
        node *tmp;
        while ((*lista) != NULL){
            tmp = *lista;
            *lista = (*lista)->prox;
            free(tmp);
        }
        *lista=NULL;
    }
}

int main(){
    LISTA *lista = criarLista();
    int op;
    for(int i=0;i<=50;i++){
        insereOrdenado(lista, i);
    }
    do{
    printf("O que deseja:\n");
    printf("1 - inserir ordenado\n");
    printf("2 - mostrar lista\n");
    printf("3 - remover ordenado\n");
    printf("4 - procura lista\n");
    printf("0 - SAIR\n");
    scanf("%d",&op);
    switch(op){
    case 1:

        break;
    case 2:
        exibe(lista);
        break;
    case 3:
        removeOrdenado(lista);
        break;
    case 4:
        procuraValor(lista);
        break;
    default:
        printf("Opcao nao cadastrada...\n");
        break;
    }
    }while(op != 0);
    libera(lista);
    free(lista);
}

