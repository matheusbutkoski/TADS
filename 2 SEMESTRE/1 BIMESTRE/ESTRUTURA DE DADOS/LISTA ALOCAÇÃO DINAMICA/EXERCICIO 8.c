#include <stdio.h>
#include <stdlib.h>

int main(){
 int num, *x, qtda, i;
 qtda = 1;
 x = (int*) malloc(qtda * sizeof(int));
do{
    printf("Informe Numero:\n");
    scanf("%i", &num);

        if(qtda != 1 && num > 0){
            x = (int*) realloc(x,qtda*sizeof(int));
        }
        if(num > 0){
            x[qtda-1] = num;
            qtda++;
        }
}while (num > 0);
    for(i=0;i<qtda;i++){
        printf("%5d", x[i]);
    }
    printf("\n");
    free(x);
    system("pause");

};