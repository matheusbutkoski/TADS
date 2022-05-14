#include<stdio.h>
#include<stdlib.h>

struct  Node{//criando o tipo do elemento da lista
    int num;//dado
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

void insereInicio(LISTA* lista){
    node *novo = (node*) malloc (sizeof(node));//declara e aloca
    if(novo == NULL){
        printf("Erro na aloca��o...\n");
        exit(0);
    }
    printf("Informe valor do Novo elemento\n");
    scanf("%d",&novo->num);
    novo->prox=(*lista);
    *lista = novo;
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

void insereFinal(LISTA* lista){
    node *novo = (node*) malloc (sizeof(node));//declara e aloca
    if(novo == NULL){
        printf("Erro na aloca��o...\n");
        exit(0);
    }
    printf("Informe valor do Novo elemento\n");
    scanf("%d",&novo->num);
    novo->prox = NULL; // novo final da lista
    if ((*lista) == NULL){//se lista vazia
        *lista = novo;
    }else{
        node *tmp;// no tempor�rio
        tmp = (*lista);
        while (tmp->prox != NULL){//busca o ultimo elemento
            tmp = tmp->prox;
        }
        tmp->prox = novo;
    }
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

void ordena(LISTA* lista){ //ordena
	int cont, aux;
	node *tmp;
	if((*lista) == NULL){
		printf("LISTA VAZIA...\n");
	}else{
		do{
			cont=0;
			tmp = *lista;//ponto de partida
			while( tmp->prox != NULL){
				if (tmp->num > tmp->prox->num){
					aux = tmp->num;
					tmp->num = tmp->prox->num;
					tmp->prox->num = aux;
					cont++;// troca
				}
				tmp = tmp->prox;
			}

		}while(cont !=0);
	}
}
int removeInicio(LISTA* lista){
	if((*lista) != NULL){
		node *proxNode, *tmp;
		tmp = *lista;
		*lista = tmp->prox;
		free(tmp);
		printf("Elemento removido com sucesso...\n");
	}else{
		printf("Lista ja esta vazia... \n");
	}
}

int removeFinal(LISTA* lista){
	node *antNode, *tmp;
	tmp = *lista;
	if ((*lista) != NULL && tmp->prox == NULL){//se s� existe um elemento na lista
		*lista = NULL;
		free (tmp);
		printf("Elemento removido com sucesso...\n");
	}else if((*lista) != NULL){
		while (tmp->prox !=NULL){
			antNode = tmp;
			tmp = tmp->prox;
		}
		antNode->prox = NULL;
		free(tmp);
		printf("Elemento removido com sucesso...\n");
	}else{
		printf("Lista ja esta vazia... \n");
	}
}

int main(){
    LISTA *lista = criarLista();
    int op;
    do{
    printf("O que deseja:\n");
    printf("1 - inserir INICIO\n");
    printf("2 - inserir FINAL\n");
    printf("3 - mostrar lista\n");
    printf("4 - libera lista\n");
    printf("5 - ordena lista\n");
    printf("6 - remove INICIO\n");
    printf("7 - remove FINAL\n");
    printf("0 - SAIR\n");
    scanf("%d",&op);
    switch(op){
    case 1:
        insereInicio(lista);
        break;
    case 2:
        insereFinal(lista);
        break;
    case 3:
        exibe(lista);
        break;
    case 4:
        libera(lista);
        break;
    case 5:
        ordena(lista);
        break;
    case 6:
        removeInicio(lista);
        break;
    case 7:
        removeFinal(lista);
        break;
    default:
        printf("Opcao nao cadastrada...\n");
        break;
    }
    }while(op != 0);
    libera(lista);
    free(lista);
}
