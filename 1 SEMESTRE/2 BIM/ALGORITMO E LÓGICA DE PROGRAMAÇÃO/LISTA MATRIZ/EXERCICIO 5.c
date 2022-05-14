#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main(){

int mat[5][5], i, j, soma;

srand(time(NULL));

for(i=0; i<5; i++){
   for(j=0; j<5; j++){
        mat[i][j] = 1+rand()%99;

   }
}

for(i=0; i<5; i++){
        soma = soma + mat[i][i];
}

for(i=0; i<5; i++){
   for(j=0; j<5; j++){
        printf ("%i  ", mat[i][j]);
   }
   printf ("\n");
}

printf ("A soma da diagonal principal eh: %i\n", soma);





system("pause");
}
