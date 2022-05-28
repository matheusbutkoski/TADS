#include <stdio.h>
#include <stdlib.h>
int imp[20];
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
    system("@cls||clear");
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
                printf("\n");
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

void exibeNo(no *percorre){
    if(percorre == NULL){
        return 0;
    }else{
        exibeNo(percorre->esq);
        exibeNo(percorre->dir);
        printf("%5d", percorre->num);
    }
}
void buscarPosArvBin(ArvBin *raiz){
    if (*raiz == NULL){
        return 0;
    }else{
        exibeNo(*raiz);
    }

}

void liberaNo(no *percorre){
    if(percorre == NULL){
        return 0;
    }else{
        liberaNo(percorre->esq);
        liberaNo(percorre->dir);
        free(percorre);
    }
}
void liberaArvBin(ArvBin *raiz){
    if (*raiz == NULL){
        return 0;
    }else{
        liberaNo(*raiz);
    }

}

// EX 1
void exibeNoPre(no *percorre){
    if(percorre == NULL){
        return 0;
    }else{
        printf("%5d", percorre->num);
        exibeNoPre(percorre->esq);
        exibeNoPre(percorre->dir);

    }
}
void buscarPreArvBin(ArvBin *raiz){
    if (*raiz == NULL){
        return 0;
    }else{
        exibeNoPre(*raiz);
    }

}

//EX 2
void exibeNoIn(no *percorre){
    if(percorre == NULL){
        return 0;
    }else{
        exibeNoIn(percorre->esq);
        printf("%5d", percorre->num);
        exibeNoIn(percorre->dir);

    }
}
void buscarInArvBin(ArvBin *raiz){
    if (*raiz == NULL){
        return 0;
    }else{
        exibeNoIn(*raiz);
    }

}

//EX 3
int numNos(no *percorre, int *contNos){
    if(percorre == NULL){
        return 0;
    }else{

        numNos(percorre->esq, contNos);
        numNos(percorre->dir, contNos);
        (*contNos)++;
    }
}
int mostrarNumNos(ArvBin *raiz){
    int contNos=0;
    if (*raiz == NULL){
        return 0;
    }else{
        numNos(*raiz, &contNos);
        return contNos;
    }
}

//EX 4
int numNosNaoFolha(no *percorre, int *contNaoFol){
    if(percorre == NULL){
        return 0;
    }else{
            if(percorre->esq != NULL || percorre->dir != NULL){
                (*contNaoFol)++;
            }
        numNosNaoFolha(percorre->esq, contNaoFol);
        numNosNaoFolha(percorre->dir, contNaoFol);
    }
}
int mostrarNumNosNaoFolha(ArvBin *raiz){
    int contNaoFol=0;
    if (*raiz == NULL){
        return 0;
    }else{
        numNosNaoFolha(*raiz, &contNaoFol);
        return contNaoFol;
    }
}

//EX 5
int numNosFolha(no *percorre, int *contFol){
    if(percorre == NULL){
        return 0;
    }else{
            if(percorre->esq == NULL && percorre->dir == NULL){
                (*contFol)++;
            }
        numNosFolha(percorre->esq, contFol);
        numNosFolha(percorre->dir, contFol);
    }
}
int mostrarNumNosFolha(ArvBin *raiz){
    int contFol=0;
    if (*raiz == NULL){
        return 0;
    }else{
        numNosFolha(*raiz, &contFol);
        return contFol;
    }
}

//EX 6
int exibeMaiorNum(no *percorre, int *maior){
    if(percorre == NULL){
        return 0;
    }else{
        exibeMaiorNum(percorre->esq, maior);
        (*maior) = percorre->num;
        exibeMaiorNum(percorre->dir, maior);


    }
}
int buscarMaiorNum(ArvBin *raiz){
    int maior=0;
    if (*raiz == NULL){
        return 0;
    }else{
        exibeMaiorNum(*raiz, &maior);
        return maior;
    }

}

//EX 7
void exibeImpar(no *percorre, int *cont){
    if(percorre == NULL){
        return 0;
    }else{
        exibeImpar(percorre->esq, cont);
            imp[*cont] = percorre->num;
            (*cont)++;
        exibeImpar(percorre->dir, cont);


    }
}
void buscarImpar(ArvBin *raiz){
    int cont=0;
    if (*raiz == NULL){
        return 0;
    }else{
        exibeImpar(*raiz, &cont);
    }

}

//EX 8
int exibeAltura(no *percorre){
    if(percorre == NULL){
        return -1;
    }else{
        int esq = exibeAltura(percorre->esq);
        int dir = exibeAltura(percorre->dir);
        if(esq > dir){
            return esq + 1;
        }else{
            return dir + 1;
        }
    }
}
int buscarAltura(ArvBin *raiz){
    if (*raiz == NULL){
        return 0;
    }else{
        exibeAltura(*raiz);
    }

}

int main(){
    ArvBin *raiz;
    raiz = criarArvBin();
    int op, x;

do{
    printf("-----------------------\n");
    printf("Arvore Binaria\n");
    printf("1 - Insere\n");
    printf("2 - Busca Pos-Ordem\n");
    printf("3 - Libera Arvore\n");
    printf("4 - Busca Pre-Ordem\n");
    printf("5 - Busca In-Ordem\n");
    printf("6 - Mostrar numero de nos\n");
    printf("7 - Mostrar numero de nos nao folha\n");
    printf("8 - Mostrar numero de nos folha\n");
    printf("9 - Mostrar maior numero da arvore em ordem\n");
    printf("10 - Mostrar numeros impares da arvore em ordem\n");
    printf("11 - Mostrar Altura da Arvore\n");
    printf("0 - Sair\n");
    printf("-----------------------\n");
    scanf("%i", &op);
    system("@cls||clear");
    switch(op){
    case 1:
        insereArvBin(raiz);
        break;

    case 2:
        buscarPosArvBin(raiz);
        printf("\n");
        break;
    case 3:
        liberaArvBin(raiz);
        printf("Arvore Liberada...\n");
        break;
    case 4:
        buscarPreArvBin(raiz);
        printf("\n");
        break;
    case 5:
        buscarInArvBin(raiz);
        printf("\n");
        break;
    case 6:
        printf("Numero de Nos: %i", mostrarNumNos(raiz));
        printf("\n");
        break;
    case 7:
        printf("Numero de Nos Nao Folha: %i ", mostrarNumNosNaoFolha(raiz));
        printf("\n");
        break;
    case 8:
        printf("Numero de Nos Folha: %i ", mostrarNumNosFolha(raiz));
        printf("\n");
        break;
    case 9:
        printf("Maior Numero da arvore em ordem: %i ", buscarMaiorNum(raiz));
        printf("\n");
        break;
    case 10:
        buscarImpar(raiz);
        printf("Numeros Impares da Arvore: ");
        for(int i=0; i<20;i++){
            if(imp[i] % 2 == 0){
                }else{
                printf("%i ", imp[i]);
                }
            }
        printf("\n");
        break;
    case 11:
        printf("Altura da Arvore: %i\n", buscarAltura(raiz));
    break;
    }
}while(op != 0);

system("pause");
}

