#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main (){

int mat1[2][2], mat2[2][2], mat3[2][2], i, j;

srand(time(NULL));

for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        mat1[i][j] = 1+rand()%99;
          mat2[i][j] = 1+rand()%99;
   }
}
for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        printf ("%i  ", mat1[i][j]);
   }
   printf ("\n");
}

printf("  +    \n");

for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        printf ("%i  ", mat2[i][j]);
   }
   printf ("\n");
}
printf("  =    \n");

for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        mat3[i][j] = mat1[i][j] + mat2[i][j];

   }
}

for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        printf ("%i  ", mat3[i][j]);
   }
   printf ("\n");
}

system("pause");
}
