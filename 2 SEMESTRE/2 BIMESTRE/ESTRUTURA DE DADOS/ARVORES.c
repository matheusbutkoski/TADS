#include <stdio.h>
#include <stdlib.h>

struct No{

    int num;
    struct No *esq;
    struct No *dir;
};

typedef struct No no;
typedef no *ArvBin;


ArvBin criarArvBin(){
    ArvBin *raiz = (ArvBin*)malloc(sizeof(ArvBin));
    if(raiz != NULL){
        *raiz = NULL;
    }else{
        printf("Erro na alocacao...\n");
        return 0;
    }
    return raiz;
}

int insereArvBin(ArvBin *raiz){
    no *novo = (no*) malloc(sizeof(no));
    if(novo == NULL){
        printf("Erro na Alocacao...\n");
        return 0;
    }else{

    }
    printf("Informe valor a ser inserido na arvore\n");
    scanf("%i", &novo->num);
    novo->esq = NULL;
    novo->dir = NULL;
    if(*raiz == NULL){
        *raiz = novo;

    }else{
        no *atual = *raiz;
        no *ant = NULL;
        while(atual != NULL){
            ant = atual;
            if(atual->num == novo->num){
                printf("Elemento ja existe");
                free (novo);
                return 0;
            }
            if(novo->num > atual->num){
                atual = atual->dir;
            }else{
                atual = atual->esq;
            }
        }
        if(novo->num > ant->num){
            ant->dir = novo;

        }else{
            ant->esq = novo;
        }
    }
}
int main(){
    ArvBin *raiz;
    raiz = criarArvBin();
    int op;
    printf("Arvore Binaria\n");
    printf("1 - Insere\n");
    scanf("%i", &op);
    switch(op){
    case 1:
        insereArvBin(raiz);
        break;

    }

system("pause");
}
