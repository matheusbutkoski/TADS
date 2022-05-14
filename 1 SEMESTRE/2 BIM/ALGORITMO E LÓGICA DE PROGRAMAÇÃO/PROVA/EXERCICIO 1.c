#include <stdio.h>
#include <stdlib.h>


int main(){

int vet[6], i, valor, cont=0, j;
printf("Informe seu Jogo com 6 numeros\n");
for(i=0;i<6;i++){
    scanf("%i", &valor);

        if(i==0){
        vet[i] = valor;
        }else{
            do{
            for(j=0;j<1;j++){
               if(valor == vet[j]){
                    cont++;
                }
            }
        if(cont!=0){
            printf("Informe novo valor\n");
            scanf("%i", &valor);

        }else{
            vet[i]=valor;
            }
        }while(cont!=0);
    }
}
printf("Vetor sem numeros repetidos\n");
for(i=0;i<6;i++){
    printf("%i  ", vet[i]);
}


system("pause");
}
