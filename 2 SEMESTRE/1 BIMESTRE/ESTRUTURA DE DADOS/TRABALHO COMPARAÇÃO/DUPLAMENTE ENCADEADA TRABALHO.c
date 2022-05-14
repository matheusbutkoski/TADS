#include <stdio.h>
#include <stdlib.h>

struct  Node{//criando o tipo do elemento da lista
    int num;//dado
    struct Node *ant;
	struct Node *prox;
};
typedef struct Node node;//apelido
typedef node *LISTA;//declara��o ponteiro da cabe�a da lista

LISTA *busca;//ponteiro que guarda a busca

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

int insereOrdenado(LISTA* lista, int i){ //funcao insere no inicio duplamente
    node *novo=(node *) malloc(sizeof(node)); //aloca novo elemento
    node *tmp = *lista;//cria auxiliar
    if(novo == NULL){//testa se alocacao ocorreu
        printf("Sem memoria disponivel!\n");
        exit(0);
    }
    novo->num = i;
    if((*lista) == NULL){ // verifica se lista vazia e insere no inicio
    	*lista = novo;
    	novo->ant = NULL;
    	novo->prox = NULL;
	}else if((*lista) != NULL){
    	while(tmp->num < novo->num && tmp->prox != NULL){//percorre ate o at� encontrar elemento maior que num
            tmp = tmp->prox;
        }
        if (tmp->ant == NULL){//unico n�
        	if(tmp->num < novo->num){//insere depois
        		tmp->prox = novo;
        		novo->ant = tmp;
        		novo->prox = NULL;
			}else{                   //insere antes
				(*lista)->ant = novo;
				novo->ant = NULL;
				novo->prox = *lista;
				*lista = novo;
			}
       	}else if ( tmp->prox != NULL && tmp->num > novo->num){
            tmp->ant->prox = novo;
            novo->ant=tmp->ant;
            tmp->ant = novo;
            novo->prox = tmp;
       	}
       	else if (tmp->prox == NULL && tmp->num > novo->num){ // insere no final
			novo->ant = tmp->ant;
			novo->prox = tmp;
			tmp->ant->prox = novo;
			tmp->ant = novo;
	   	}else if (tmp->prox == NULL && tmp->num < novo->num){
        	novo->prox = tmp->prox;
        	tmp->prox = novo;
        	novo->ant = tmp;
    	}
	}
}

void exibe(LISTA* lista){
    node *tmp, *ultimo,*atual=NULL;// no tempor�rio
    int op, cont=0,b;
    tmp = (*lista);
    if( (*lista) == NULL){
        printf("LISTA VAZIA...\n");
    }else{
       do{
            if (cont != 0){
                tmp = atual;
                cont=0;
            }
               printf("qual numero deseja buscar\n");
               scanf("%d", &b);
               if (tmp->num > b){//voltar
                   while (tmp != NULL && tmp->num != b){
                        ultimo=tmp;
                        tmp = tmp->ant;
                        cont++;
                    }
                    if (tmp == NULL ){
                        printf("elemento nao encontrado\n");
                        atual = ultimo;
                    }else{
                        printf("Foram percorridos %i elementos a esquerda para encontra o numero %i\n", cont, b);
                        atual = tmp;
                    }
               }else if (tmp->num < b){//avan�a
                   while (tmp != NULL && tmp->num != b){
                        ultimo = tmp;
                        tmp = tmp->prox;
                        cont++;
                    }
                    if (tmp == NULL ){
                        printf("elemento nao encontrado\n");
                        atual = ultimo;
                    }else{
                        printf("Foram percorridos %i elementos a direita para encontra o numero %i\n", cont, b);
                        atual = tmp;
                    }
               }else{
                    printf("N�o precisa percorrer nenhum elemento\n");
               }
        printf("Deseja buscar novo numero? 1 - S ou 0 - N\n");
        scanf("%i",&op);
       }while (op != 0);
    }
}

int removeTodos(LISTA* lista){
	int p;
	printf("qual numero quer remover do meio\n");
	scanf("%d", &p);
	if((*lista) != NULL){
		node *tmp;
		tmp = *lista;
		while (tmp != NULL && tmp->num != p){
			tmp = tmp->prox;
		}
		if (tmp == NULL){
            printf("elemento nao encontrado\n");
        }else if (tmp->ant == NULL){//se primeiro elemento
            if(tmp->ant == NULL && tmp->prox == NULL){//quando s� tem 1 elemento na lista
                *lista=NULL;
                free(tmp);
                printf("Elemento removido com sucesso...\n");
            }else if((*lista) != NULL){
                *lista=(*lista)->prox;
                (*lista)->ant=NULL;//altera��o
                free(tmp);
                printf("Elemento removido com sucesso...\n");
            }
        }else if (tmp->prox == NULL){ // se ultimo elemento
            if(tmp->ant == NULL && tmp->prox == NULL){
                *lista=NULL;
                free(tmp);
                printf("Elemento removido com sucesso...\n");
            }else if((*lista) != NULL){
                tmp->ant->prox = NULL;
                free(tmp);
                printf("Elemento removido com sucesso...\n");
            }
		} else if(tmp->prox != NULL){//est� no meio
			tmp->ant->prox = tmp->prox;
			tmp->prox->ant = tmp->ant;
			free(tmp);
            printf("Elemento removido com sucesso...\n");
		}
	}else{
		printf("Lista ja esta vazia... \n");
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

int main(){
    LISTA *lista = criarLista();
    int opt;

    for(int i=0;i<=50;i++){
        insereOrdenado(lista, i);
    }

    do{
        printf("Escolha a opcao\n");
        printf("1. Insere Ordenado\n");
        printf("2. Exibe lista\n");
        printf("3. Remove\n");
        printf("0. Sair\n");
        scanf("%d", &opt);
        switch(opt){
            case 1:
                break;
            case 2:
                exibe(lista);
                break;
            case 3:
                removeTodos(lista);
                break;
            default:
            	printf("Opcao invalida...\n");
            	break;
        }
    }while(opt != 0);
    libera(lista);
    free(lista);
}
