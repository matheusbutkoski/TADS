#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main (){

int mat[4][4], i, j, maior, linha, coluna;

printf ("Informe 16 valores\n");
srand(time(NULL));

for(i=0;i<4;i++){
   for(j=0; j<4; j++){
    mat[i][j] = 1+rand()%99;
   }
   }
for(i=0;i<4;i++){
   for(j=0; j<4; j++){
     if(i==0 && j==0){
        maior = mat[i][j];
        linha = i;
        coluna = j;
     }
     if (mat[i][j] >  maior){
        maior = mat[i][j];
        linha = i;
        coluna = j;
     }

   }
}
for(i=0;i<4;i++){
   for(j=0; j<4; j++){
        printf ("%i  ", mat[i][j]);
   }
   printf ("\n");
}
printf ("O maior valor encontrado foi %i\n", maior);
printf ("O maior valor esta na Linha %i Coluna %i\n", linha, coluna);


system("pause");
}
