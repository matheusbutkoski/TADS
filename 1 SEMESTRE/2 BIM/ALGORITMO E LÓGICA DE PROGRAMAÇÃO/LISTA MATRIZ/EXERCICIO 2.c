#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main (){

int mat[3][2],i,j;

srand(time(NULL));

for(i=0; i<3; i++){
   for(j=0; j<2; j++){
    mat[i][j] = 1+rand()%99;
    }
}
for(i=0;i<3;i++){
   for(j=0; j<2; j++){
        printf ("%i  ", mat[i][j]);
   }
   printf ("\n");

}
 printf ("\n");

for(i=0; i<3; i++){
   for(j=0; j<2; j++){
    mat[i][j] = mat[i][j] * 11;
    }
}

for(i=0;i<3;i++){
   for(j=0; j<2; j++){
        printf ("%i  ", mat[i][j]);
   }
   printf ("\n");
}





system("pause");
}
