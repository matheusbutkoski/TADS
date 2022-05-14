#include <stdio.h>
#include <stdlib.h>

int maior(){

int n1, n2;

    printf("Informe um valor\n");
    scanf("%i", &n1);
    printf("Informe outro valor\n");
    scanf("%i", &n2);

    if (n1 > n2){
        return n1;
    }
    if (n2 > n1){
        return n2;
    }
    }

int main(int n1, int n2){

int num = maior(n1,n2);

printf("O maior valor eh: %i\n", num);
system("pause");
}
