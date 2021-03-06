#include <stdio.h>
#include <stdlib.h>

/***************************arvore******************************************/

struct No{ //cria a estrutura da arvore
    int num, altura;
    struct No *esq;//ponteiro que aponta para o filho esquerdo
	struct No *dir; //ponteiro que aponta para o filho direito
};
typedef struct No no;
typedef no *ArvBin;

ArvBin* criarArvBin(){
    ArvBin *raiz =(ArvBin*) malloc (sizeof(ArvBin));//aloca ponteiro raiz da arvore
    if(raiz != NULL){
        *raiz=NULL;
    }else{
        printf("Erro na aloca��o...\n");
        exit(0);
    }
    return raiz;
}

int insere_ArvBin(ArvBin* raiz, int *maiorE, int *maiorD, int *cont){
    int compara;
    no *novo=(no *) malloc(sizeof(no)); //aloca novo elemento
    if(novo == NULL){//testa se alocacao ocorreu
        printf("Sem memoria disponivel!\n");
        exit(0);
    }
    printf("Novo elemento: ");
    scanf("%d", &novo->num);
    ++(*cont);
    novo->dir = NULL;
    novo->esq = NULL;
    novo->altura=1;
    if(*raiz == NULL){//se arvore vazia insere primeiro n�
        *raiz = novo;
    }else{
        no *atual = *raiz;
        compara = atual->num;
        no *ant = NULL;
        while (atual != NULL){
            ant = atual;
            if(novo->num == atual->num){
                printf("Elemento j� existe...");
                free(novo);
                return 0;//elemento j� existe
            }
            if(novo->num > atual->num){
                atual = atual->dir;
            }else{
                atual = atual->esq;
            }
        }
        if (novo->num > ant->num){
            ant->dir = novo;
            novo->altura = ant->altura+1;
            if(*maiorD < novo->altura && novo->num > compara){
                *maiorD = novo->altura;
            }
        }else{
            ant->esq = novo;
            novo->altura = ant->altura+1;
            if(*maiorE < novo->altura && novo->num < compara){
                *maiorE = novo->altura;
            }
        }
    }
}


void exibe_NO(no *percorre){//fun��o recursiva para percorrer
	if(percorre == NULL){
		return;
	}else{
		exibe_NO(percorre->esq); //desce subarvore esquerda
		//printf("aqui\n");
		exibe_NO(percorre->dir); //desce subarvore direita
		printf("%5d   altura %d\n", percorre->num,percorre->altura);
	}
}
int exibe_ArvBin(ArvBin* raiz){
    if(raiz == NULL){//se arvore vazia
    	return 0;
 	}else{
        exibe_NO(*raiz);//chama fun��o recursiva
    }
  printf("\n");
}

void libera_NO(no *percorre){//fun��o recursiva para percorrer
	if(percorre == NULL){
		return;
	}else{
		libera_NO(percorre->esq); //desce subarvore esquerda
		libera_NO(percorre->dir); //desce subarvore direita
		free(percorre);
   }
}
int libera_ArvBin(ArvBin* raiz){
    if(raiz == NULL){//se arvore vazia
    	return 0;
 	}else{
        libera_NO(*raiz);//chama fun��o recursiva
    }
    free(raiz);
}

no *removeNo(no *atual){//fun��o respons�vel por tratar
	no *no1, *no2;       //os tr�s tipos de remo��o
	if(atual->esq == NULL){     //n� folha ou com 1 filho
        no2 = atual->dir;
        free(atual);
        return no2;
	}
	no1 = atual;//na sub-arvore da esquerda e procura o mais a direita
	no2 = atual->esq;
	while(no2->dir != NULL){
        no1 = no2;
        no2 = no2->dir;
	}
	if(no1 != atual){//copia o filho mais a direita na sub-arvore esquerda
        no1->dir = no2->esq;    //para o lugar do n� removido
        no2->esq = atual->esq;
	}
	no2->dir = atual->dir;
	free(atual);
	return no2;
}
int remove_ArvBin(ArvBin* raiz){//fun��o respons�vel pela busca
    int valor;                  //do n� que ser� removido
    printf("Informe valor a ser removido:\n");
    scanf("%d", &valor);
    if(raiz == NULL){//se arvore vazia
    	return 0;
 	}else{
        no *ant = NULL,*atual = *raiz;
        while (atual != NULL){
            if(valor == atual->num){//busco o valor
                if(atual == *raiz){ //remover a raiz
                    *raiz = removeNo(atual);
                }else{
                    if(ant->dir == atual){
                        ant->dir = removeNo(atual);//remove direita
                    }else{
                        ant->esq = removeNo(atual);//remove esquerda
                    }                }
                return 1;            }//n�o achei o no - ando na arvore - igual na inser��o
            ant = atual;
            if(valor > atual->num){
                atual = atual->dir;
            }else{
                atual = atual->esq;
            }        }    }     }
void balanca_NO(no *percorre, LISTA* lista){//fun��o recursiva para percorrer
	if(percorre == NULL){
		return;
	}else{
		balanca_NO(percorre->esq, lista); //desce subarvore esquerda
		insereOrdenado(lista,percorre->num);
		balanca_NO(percorre->dir,lista); //desce subarvore direita

	}
}
int balancear_ArvBin(ArvBin* raiz, LISTA* lista){
    if(raiz == NULL){//se arvore vazia
    	return 0;
 	}else{
        balanca_NO(*raiz,lista);//chama fun��o recursiva
    }
  printf("\n");
}

int altNo (no* percorre){
    if (percorre == NULL){
        return -1;

    }else{
        return percorre -> altura
    }
}

int fatorBalanceamento(no* percorre){
    return abs(altNo(percorre->esq)- altNo(percorre->dir));
}

int maior(int x, int y){
    if(x>y){
        return x;
    }else{
        return y;
    }
}
int rotacaoLL(ArvAvl* raiz){
        no* percorre;
        percorre = (*raiz)->esq;
        (*raiz)->esq = percorre->dir;
        percorre->dir = *raiz;
        (*raiz)->altura = maior(altNo((*raiz)->esq), altNo((*raiz)->dir))+1;
        percorre->altura = maior(altNo(percorre->esq), (*raiz)->altura)+1;
        *raiz = percorre;
}

int rotacaoRR(ArvAvl* raiz){
        no* percorre;
        percorre = (*raiz)->dir;
        (*raiz)->dir = percorre->dir;
        percorre->esq = *raiz;
        (*raiz)->altura = maior(altNo((*raiz)->esq), altNo((*raiz)->dir))+1;
        percorre->altura = maior(altNo(percorre->dir), (*raiz)->altura)+1;
        *raiz = percorre;
}

int rotacaoLR(ArvAvl* raiz){
    rotacaoRR(&(*raiz)->esq);
    rotacaoLL(raiz);
}

int rotacaoRL(ArvAvl* raiz){
    rotacaoLL(&(*raiz)->dir);
    rotacaoRR(raiz);
}

int main(){
    ArvBin *raiz = criarArvBin();
    int opt,numero_no,maiorE=0, maiorD=0, cont=0;
    do{
        printf("Escolha a opcao\n");
        printf("1. Insere \n");
        printf("2. Exibe \n");
        printf("3. Remove\n");
        printf("4. Balancear Arvore\n");
        printf("0. Sair\n");
        scanf("%d", &opt);
        switch(opt){
            case 1:
                insere_ArvBin(raiz,&maiorE,&maiorD,&cont);
                break;
            case 2:
                exibe_ArvBin(raiz);
                printf("%i maior direita\n", maiorD);
                printf("%i maior esquerda\n", maiorE);
                printf("%d\n",abs(maiorE-maiorD));
                if(abs(maiorE-maiorD)>=2){
                    printf("Arvore Desbalanceada\n");
                }else{
                    printf("Arvore Balanceada\n");
                }
                break;
            case 3:
                remove_ArvBin(raiz);
                break;
            case 4:
                libera(lista);
                balancear_ArvBin(raiz,lista);
                printf("a lista cont�m %i elementos\n", cont);
                break;
            default:
            	printf("Opcao invalida...\n");
            	break;
        }
    }while(opt != 0);
    libera_ArvBin(raiz);
}
