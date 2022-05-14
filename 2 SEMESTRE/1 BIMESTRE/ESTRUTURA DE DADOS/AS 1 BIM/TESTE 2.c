#include <stdio.h>
#include <stdlib.h>

int main (){
int n1, n2, cont=0, i, a[10], b[10], soma=0;
printf("Insira dois numeros que deseja multiplicar\n");
    scanf("%i", &n1);
    scanf("%i", &n2);
printf("\n");
a[0] = n1;
b[0] = n2;

for(i=1;n1!=1;i++){
    n1 = n1/2;
    a[i] = n1;
    cont++;
}

for(i=1;i<=cont;i++){
    n2 = n2 * 2;
    b[i] = n2;

}

for(i=0;i<=cont;i++){
    if(a[i] % 2 == 0){

    }else{
        soma = soma + b[i];
    }
}
printf("Coluna A    Coluna B\n");

for(i=0;i<=cont;i++){
    printf("   %i          %i\n", a[i], b[i]);
        }

printf("-----------------\n");
printf("Resultado: %i\n", soma);
printf("-----------------\n");
system("pause");
};


int divide(int n1, int cont){
    int a[10];
    if (n1 == 1){
        return cont;

        }else{
        n1 = n1/2;
        printf("%i\n", n1);
        a[cont] = n1;
        cont = cont + 1;

        divide(n1, cont);
        }
}

int multiplica(int n2, int x){

    if (x == 0){
        return n2;

        }else{
       n2 = n2 * 2;
       printf("%i\n", n2);
       x--;
       multiplica(n2, x);
    }
}
