#include <stdio.h>
#include <stdlib.h>
#include <time.h>



int main(){

int mat[3][3], vet[3], soma1=0, soma2=0, soma3=0, i ,j;

srand(time(NULL));

for(i=0; i<3; i++){
   for(j=0; j<3; j++){
        mat[i][j] = 1+rand()%99;

   }
}
for(i=0; i<1; i++){
   for(j=0; j<3; j++){
       soma1 = soma1 + mat[i][j];
        vet[i]= soma1;
   }}

for(i=1; i<2; i++){
   for(j=0; j<3; j++){
       soma2 = soma2 + mat[i][j];
        vet[i]= soma2;
   }}

for(i=2; i<3; i++){
   for(j=0; j<3; j++){
       soma3 = soma3 + mat[i][j];
       vet[i]= soma3;
   }}

for(i=0; i<3; i++){
   for(j=0; j<3; j++){
        printf ("%i  ", mat[i][j]);
   }
   printf ("\n");
}

for(i=0; i<3; i++){
printf ("%i  ", vet[i]);
}

system("pause");
}
