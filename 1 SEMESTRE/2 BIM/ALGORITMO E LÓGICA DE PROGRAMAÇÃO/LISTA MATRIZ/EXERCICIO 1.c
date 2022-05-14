#include <stdio.h>
#include <stdlib.h>
#include <time.h>



int main (){

int mat[4][4], i ,j, soma;

printf ("Complete a matriz 4x4\n");
srand(time(NULL));

for(i=0;i<4;i++){
   for(j=0;j<4;j++){
    mat[i][j] = 1+rand()%99;
     soma = soma + mat[i][j];
   }
}

for(i=0;i<4;i++){
   for(j=0; j<4; j++){
        printf ("%i  ", mat[i][j]);
   }
   printf ("\n");
}
printf("A soma de todos os valores da matriz eh: %i\n", soma);


system("pause");
}
