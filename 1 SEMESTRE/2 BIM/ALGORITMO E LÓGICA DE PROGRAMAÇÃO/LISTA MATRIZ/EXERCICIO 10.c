#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main(){

int mat[5][5], j, i, cont=0, igual;


do{
igual = 0;
for(i=0;i<5;i++){
   for(j=0; j<5; j++){
    mat[i][j] = 1+rand()%99;
    if (mat[i][j] == mat[j][i]){
        igual = 1;
    }

    if(igual == 0){
        cont++;
    }
   }
   }

}while(cont <= 5);

for(i=0;i<5;i++){
   for(j=0; j<5; j++){
    printf ("%i  ", mat[i][j]);
   }
   printf("\n");
}


system("pause");
}
