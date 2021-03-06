#include<stdio.h>
#include<stdlib.h>

typedef struct no{ //define como ser? o elemento na lista
    int valor;
    struct no *proximo;
}No;

typedef struct{ // cria a estrutura da lista
    No *inicio;
    No *fim;
    int tam;
}Lista;

void criar_lista(Lista *lista){ //fun??o que ir? criar a lista
    lista->inicio = NULL; // define o inicio da lista como NULL
    lista->fim = NULL; // define o fim da lista como NULL
    lista->tam = 0; // define o tamanho tempor?rio da lista
}

void inserir_no_inicio(Lista *lista, int num){ //fun??o que insere elemento no come?o da lista
    No *novo = malloc(sizeof(No)); //cria a variavel novo a partir do n? e aloca as posi??es para a inser??o

    if(novo){
        novo->valor = num; // define o valor que novo recebe
        novo->proximo = lista->inicio; // define a dire??o de novo
        lista->inicio = novo;// insere novo na lista
        if(lista->fim == NULL) //caso nenhum fim tenha sido adicionado ainda, definir? o fim como o valor de novo
            lista->fim = novo;
        lista->fim->proximo = lista->inicio; // define o formato circular da lista
        lista->tam++;
    }
    else
        printf("Erro ao alocar memoria!\n");
}

void inserir_no_fim(Lista *lista, int num){ // insere elemento no fim da lista
    No *aux, *novo = malloc(sizeof(No));

    if(novo){
        novo->valor = num; // novo recebe o novo valor
        if(lista->inicio == NULL){ //caso nenhum inicio tenha sido adicionado, define o mesmo valor para inicio e fim da lista
            lista->inicio = novo;
            lista->fim = novo;
            lista->fim->proximo = lista->inicio; //define o formato circular da lista
        }
        else{ // se um inicio ja foi adicionado, define o fim da lista com o novo valor
            lista->fim->proximo = novo;
            lista->fim = novo;
            novo->proximo = lista->inicio;
        }
        lista->tam++;
    }
    else
        printf("Erro ao alocar memoria!\n");
}

void inserir_ordenado(Lista *lista, int num){ //funcao que ira inserir os valores de forma ordenada, baseado nas fun??es anteriores
    No *aux, *novo = malloc(sizeof(No));

    if(novo){
        novo->valor = num;
        if(lista->inicio == NULL){ // se o inicio for NULL chamar? a fun??o para inserir no inicio
            inserir_no_inicio(lista, num);
        }
        else if(novo->valor < lista->inicio->valor){//se o valor de "novo" for menor que o valor do inicio ja presente na lista, colocar? o valor de "novo" no inicio de forma ordenada
            inserir_no_inicio(lista, num);
        }
        else{ // se o valor for "maior" que o do inicio, ir? percorrer a lista at? achar o valor que seja maior que "novo"
            aux = lista->inicio; //variavel auxiliar recebe o conteudo de lista
            while(aux->proximo != lista->inicio && novo->valor > aux->proximo->valor)//percorre a lista at? achar um valor maior que novo
                aux = aux->proximo;
            if(aux->proximo == lista->inicio)//insere no fim, caso nao tenha achado um valor maior que "novo"
                inserir_no_fim(lista, num);
            else{// insere no lugar correto, caso tenha achado um numero maior
                novo->proximo = aux->proximo;
                aux->proximo = novo;
                lista->tam++;
            }
        }
    }
    else
        printf("Erro ao alocar memoria!\n");
}

No* remover(Lista *lista, int num){// funcao que remove valores da lista
    No *aux, *remover = NULL; //admite NULL para as variaveis

    if(lista->inicio){
        if(lista->inicio == lista->fim && lista->inicio->valor == num){//remove o elemento caso o inicio e fim da lista forem de mesmo valor e estiverem na mesma posi??o
            remover = lista->inicio;
            lista->inicio = NULL;
            lista->fim = NULL;
            lista->tam--;
        }
        else if(lista->inicio->valor == num){//remove o inicio da lista caso o elemento procurado estiver no inicio
            remover = lista->inicio;
            lista->inicio = remover->proximo;
            lista->fim->proximo = lista->inicio;
            lista->tam--;
        }
        else{
            aux = lista->inicio;
            while(aux->proximo != lista->inicio && aux->proximo->valor != num)//percorre a lista at? encontrar o valor na lista
                aux = aux->proximo;
            if(aux->proximo->valor == num){//se o valor encontrado for igual ao digitado pelo usu?rio a condi??o ser? executada
                if(lista->fim == aux->proximo){//se estiver no final da lista ? removido
                    remover = aux->proximo;
                    aux->proximo = remover->proximo;
                    lista->fim = aux;
                }
                else{//se nao estiver no final ser? removido
                    remover = aux->proximo;
                    aux->proximo = remover->proximo;
                }
                lista->tam--;//decrementa o tamanho da lista
            }
        }
    }

    return remover;//retorna valor que foi removido
}

No* buscar(Lista *lista, int num){//fun??o para buscar na lista
    No *aux = lista->inicio;// aux receba o conteudo de lista

    if(aux){
        do{// percorre a lista at? encontrar o valor, assim que encontrado, retorna na fun??o
            if(aux->valor == num)
                return aux;//retorna valor encontrado
            aux = aux->proximo;
        }while(aux != lista->inicio);//repetir? at? que a lista circular volte ao inicio, impedindo um looping
    }
    return NULL;//se o valor nao for encontrado, retorna NULL
}

void exibe_lista(Lista *lista){//fun??o para exibir a lista
    No *no = lista->inicio;// receba conteudo de lista "
    printf("\nLista de tamanho igual a %d:\n ", lista->tam);// variavel lista->tam foi incrementada e decrementada durante as inser??es e remo??es
    if(no){
        do{//percorrera a lista at? encontrar seu inicio
            printf("%d ", no->valor);//mostra a lista ao usu?rio
            no = no->proximo;
        }while(no != lista->inicio);
        printf("\nInicio da lista: %d\n", no->valor);//mostra ao usuario o inicio da lista
    }
    printf("\n\n");
}

int main(){//fun??o main

    int opcao, valor, anterior;
    Lista lista;//define lista como a estrutura criada anteriormente
    No *removido;//cria que receber? valor retornado nas fun??es de remo??o e busca
    criar_lista(&lista);//chama a fun??o para a cria??o da lista
    do{
        printf("\n1 - Inserir\n2 - Remover\n3 - Exibir Lista\n4 - Buscar\n0 - Sair\n");
        scanf("%d", &opcao);

        switch(opcao){
        case 1:
            printf("Digite um valor: ");
            scanf("%d", &valor);
            inserir_ordenado(&lista, valor);//chama fun??o de inser??o ordenada
            break;
        case 2:
            printf("Digite um valor a ser removido: ");
            scanf("%d", &valor);
            removido = remover(&lista, valor);//"removido" recebe o valor retornado pela fun??o de remo??o
            if(removido){
                printf("Elemento removido: %d\n", removido->valor);
                free(removido);
            }
            else
                printf("elemento nao encontrado!\n");//se o valor retornado for igual a NULL, exibe a mensagem
            break;
        case 3:
            exibe_lista(&lista);//chama a fun??o exibe_lista
            break;
        case 4:
            printf("Digite um valor a ser buscado: ");
            scanf("%d", &valor);
            removido = buscar(&lista, valor);//"removido" recebe valor retornado pela fun?ao de busca
            if(removido)
                printf("Valor encontrado: %d\n", removido->valor);
            else
                printf("Valor nao encontrado!\n");//se o valor retornado for igual a NULL, exibe a mensagem
            break;
        default:
            if(opcao != 0)
                printf("Opcao invalida!\n");
        }

    }while(opcao != 0);

}
