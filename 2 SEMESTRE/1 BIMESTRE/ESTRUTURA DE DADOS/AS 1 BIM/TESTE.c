#include <stdio.h>
#include <stdlib.h>
int colA[10], colB[10];

int russa(int n1, int n2, int cont, int i){
int soma=0;
    if(n1 == 1){
        if(cont == 0){

        }else{
        n2 = n2 * 2;
        printf("%i\n", n2);
        colB[i] = n2;
        printf("--%i--\n", colB[i]); // <- se tirar a marcação verá que o vetor está armazenando corretamente
        cont--;
        i++;
        russa(n1, n2, cont, i);
        }

    }else{
        n1 = n1/2;
        printf("%i\n", n1);
        colA[cont] = n1;
        printf("--%i--\n", colA[cont]); // <- aqui também armazena corretamente
        cont++;
        russa(n1, n2, cont, i);
        }
}
int main(){
int n1, n2, i=0, cont=0, x=0;
printf("Insira dois numeros que deseja multiplicar\n");
    scanf("%i", &n1);
    scanf("%i", &n2);
    printf("\n");
printf("%i\n", n1);
russa(n1, n2, cont, i);
for (i=0;i<10;i++){ // o problema esta nessas 4 linhas abaixo
                if(colA[i] % 2 == 0){
                    }else {
                    x = x + colB[i];
                    printf("--%i--\n", colB[i]); // <- aqui os valores já estão errados. Diferente do que foi armazenado abaixo
                }
            }

printf("-----------------\n");
printf("Soma final: %i\n", x);
printf("-----------------\n");
system("pause");
}
