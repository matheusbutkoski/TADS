#include <stdio.h>
#include <stdlib.h>

int colA[10], colB[10];


int divide(int n1, int cont, int i){
    if (n1 == 1){
        return cont;

        }else{
        n1 = n1/2;
        colA[i] = n1;
        cont++;
        i++;
        divide(n1, cont, i);
        }
}

int multiplica(int n2, int x, int i){

    if (x == 0){
        return n2;
        }else{
       n2 = n2 * 2;
       colB[i] = n2;
       x--;
       i++;
       multiplica(n2, x, i);
    }
}


int main(){
int n1, n2, i=1, cont=0, x=0, soma=0;
printf("Insira dois numeros que deseja multiplicar\n");
    scanf("%i", &n1);
        printf("Informe o outro numero\n");
            scanf("%i", &n2);
            printf("\n");

colA[0] = n1;
colB[0] = n2;

system("@cls||clear");

x = divide(n1, cont, i);
multiplica(n2, x, i);

 for(i=0;i<=10;i++){
    if(colA[i] % 2 == 0){
        }else{
            soma = soma + colB[i];
    }
 }

printf("Coluna A    Coluna B\n");

for(i=0;i<=x;i++){
    printf("   %i          %i\n", colA[i], colB[i]);
        }

printf("-----------------\n");
printf("Resultado: %i\n", soma);
printf("-----------------\n");
system("pause");
}
