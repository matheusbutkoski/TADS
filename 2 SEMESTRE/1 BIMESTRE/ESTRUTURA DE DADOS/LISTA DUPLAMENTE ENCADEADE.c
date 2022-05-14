#include <stdio.h>
#include <stdlib.h>

struct  Node{//criando o tipo do elemento da lista
    int num;//dado
    struct Node *ant;
	struct Node *prox;
};
typedef struct Node node;//apelido
typedef node *LISTA;//declara��o ponteiro da cabe�a da lista


LISTA* criarLista(){
    LISTA *inicio =(LISTA*) malloc (sizeof(LISTA));//aloca cabe�a da lista
    if(inicio != NULL){
        *inicio=NULL;
    }else{
        printf("Erro na aloca��o...\n");
        exit(0);
    }
    return inicio;
}

int insereInicio(LISTA* lista){ //funcao insere no inicio duplamente
    node *novo=(node *) malloc(sizeof(node)); //aloca novo elemento
    if(novo == NULL){//testa se alocacao ocorreu
        printf("Sem memoria disponivel!\n");
        exit(0);
    }
    printf("Novo elemento: ");
    scanf("%d", &novo->num);
    if((*lista) == NULL){ // verifica se lista vazia
    	*lista = novo;
    	novo->ant = NULL;
    	novo->prox = NULL;
	}else{
		(*lista)->ant = novo;
		novo->ant = NULL;
		novo->prox = *lista;
		*lista = novo;
	}
}

int insereFim(LISTA* lista){
    node *novo=(node *) malloc(sizeof(node));
    if(novo == NULL){//testa se alocacao ocorreu
        printf("Sem memoria disponivel!\n");
        exit(1);
    }
    printf("Novo elemento: ");
    scanf("%d", &novo->num);
    if((*lista) == NULL){//verifica se lista esta vazia
    	*lista = novo;
    	novo->ant = NULL;
    	novo->prox = NULL;
    }else{
        node *tmp = *lista;//cria auxiliar
        while(tmp->prox != NULL){//percorre ate o ultimo elemento da lista
            tmp = tmp->prox;
        }
        novo->ant = tmp;//NOVO
        tmp->prox = novo;//fim velho recebe fim novo
        novo->prox = NULL;
    }
}

int libera(LISTA* lista){
    if((*lista) != NULL){
        node *proxNode, *atual;// auxiliar para ajudar free
        atual = *lista;
        while(atual->prox != NULL){
            proxNode = atual->prox;
            free(atual);
            atual = proxNode;
        }
        *lista = NULL;//seta novamente para NULL pois esta vazia
    }else{
        printf("Lista ja esta vazia... \n");
    }
}
void exibe(LISTA* lista){
    node *tmp, *ultimo;
    if( (*lista) == NULL){
        printf("LISTA VAZIA...\n");
    }else{
        tmp = (*lista);
        printf("CRESCENTE....\n");
        while (tmp != NULL){
            printf("%5d", tmp->num);
            ultimo = tmp;
            tmp = tmp->prox;
        }
    }
    printf("\n");
    printf("DECRESCENTE....\n");
        while (ultimo != NULL){
            printf("%5d", ultimo->num);
            ultimo = ultimo->ant;
        }
        printf("\n");
}
int removeInicio(LISTA* lista){
	node *tmp;
	tmp = *lista;
	if(tmp->ant == NULL && tmp->prox == NULL){
		*lista=NULL;
		free(tmp);
		printf("Elemento removido com sucesso...\n");
	} else if((*lista) != NULL){
		node *tmp;
		tmp = *lista;
		*lista=(*lista)->prox;
		(*lista)->ant=NULL;//altera��o
		free(tmp);
		printf("Elemento removido com sucesso...\n");
	}else{
		printf("Lista ja esta vazia... \n");
	}
}

int removeFim(LISTA* lista){//n�o modificou nada da simples encadeada
	node *tmp;
	tmp = *lista;
	if(tmp->ant == NULL && tmp->prox == NULL){
		*lista=NULL;
		free(tmp);
		printf("Elemento removido com sucesso...\n");
	}else if((*lista) != NULL){
		while (tmp->prox !=NULL){
			tmp = tmp->prox;
		}
		tmp->ant->prox = NULL;
		free(tmp);
		printf("Elemento removido com sucesso...\n");
	}else{
		printf("Lista ja esta vazia... \n");
	}
}

int main(){
    LISTA *lista = criarLista();
    int opt;
    do{
        printf("Escolha a opcao\n");
        printf("1. Insere no inicio\n");
        printf("2. Insere no final\n");
        printf("3. Exibe lista\n");
        printf("4. Remove no inicio\n");
        printf("5. Remove no final\n");
        printf("0. Sair\n");
        scanf("%d", &opt);
        switch(opt){
            case 1:
                insereInicio(lista);
                break;
            case 2:
                insereFim(lista);
                break;
            case 3:
                exibe(lista);
                break;
            case 4:
                removeInicio(lista);
                break;
            case 5:
                removeFim(lista);
                break;
            default:
            	printf("Opcao invalida...\n");
            	break;
        }
    }while(opt != 0);
    libera(lista);
    free(lista);
}
