#include <stdio.h>
#include <stdlib.h>



int main()
{
int n,i,j;
int vetor[10];

printf ("Insira 10 numeros diferentes\n");

scanf("%d",&n);
vetor[0]=n;

for (i=1;i<10;i++){
    scanf("%d",&n);

    for (j=0;j<i;j++){

        if (vetor[j]==n){
            printf("Numero repetido, digite outro...\n");
            scanf("%i",&n);
        }
        else{
            vetor[i]=n;
        }
        }
    }

    system("pause");
    for (i=0;i<10;i++){
        printf(" %d",vetor);
    }
    return 0;
}
