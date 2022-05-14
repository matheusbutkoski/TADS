#include <stdio.h>
#include <stdlib.h>

int main(){
    int op,*pil,*fil, x, xf, i, auxp=0, auxf=0, n, nf, fim, cop;
    for(int y=1;y!=0;y++){
    printf("---------------------------\n");
    printf("PILHA\n");
    printf("1 - INSERCAO\n");
    printf("2 - REMOCAO\n");
    printf("3 - LISTAR INFORMACOES\n");
    printf("---------------------------\n");
    printf("FILA\n");
    printf("4 - INSERCAO\n");
    printf("5 - REMOCAO\n");
    printf("6 - LISTAR INFORMACOES\n");
    printf("---------------------------\n");
    scanf("%i", &op);

if(op == 1){

    if(auxp == 1){
         x=x+1;
          pil = (int *) realloc(pil,x*sizeof(int));

    printf("Informe o novo valor que deseja empilhar\n");
    scanf("%d", &pil[x-1]);
    printf("---------------------------\n");
    printf("Valor adicionado na pilha!\n");

    }else{

    printf("Informe o tamanho da pilha\n");
        scanf("%d", &x);

 pil = (int *) malloc(x * sizeof(int));
    for(i=0;i<x;i++){
    printf("Informe o valor que deseja empilhar\n");
    scanf("%d", &pil[i]);
       }

auxp = 1;
    }

        }

if(op == 2){
    printf("Quantos valores deseja retirar da pilha\n");
        scanf("%d", &n);
    x=x-n;
    pil = (int *) realloc(pil,x*sizeof(int));
    printf("---------------------------\n");
    printf("Os %d valores foram removidos do topo da pilha!\n", n);

        }

if(op == 3){

    printf("---------------------------\n");
     for(i=x;i>0;i--){
        printf("%d\n", pil[i-1]);
     }

        }

if(op == 4){

    if(auxf == 1){
         xf=xf+1;
          fil = (int *) realloc(fil,xf*sizeof(int));

    printf("Informe o novo valor que deseja enfileirar\n");
    scanf("%d", &fil[xf-1]);
    printf("---------------------------\n");
    printf("Valor adicionado na fila!\n");

    }else{

    printf("Informe o tamanho da fila\n");
        scanf("%d", &xf);

fil = (int *) malloc(xf * sizeof(int));
for(i=0;i<xf;i++){
 printf("Informe o valor que deseja enfileirar\n");
    scanf("%d", &fil[i]);
       }

auxf = 1;
    }

        }

if(op == 5){

  printf("Quantos valores deseja retirar na fila\n");
  scanf("%d", &nf);

  fim = xf-1;
   for(i=0;i<xf/2;i++){
        cop = fil[i];
        fil[i] = fil[fim];
        fil[fim] = cop;
        fim--;
    }
    xf=xf-nf;
    fil = (int *) realloc(fil,xf*sizeof(int));

 fim = xf-1;
 for(i=0;i<xf/2;i++){
        cop = fil[i];
        fil[i] = fil[fim];
        fil[fim] = cop;
        fim--;
    }

        }
if(op == 6){

    printf("---------------------------\n");
     for(i=0; i<xf; i++){
        printf("%5d", fil[i]);
     }
     printf("\n");
    }

        }
            }





