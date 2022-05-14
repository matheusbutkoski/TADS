#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int  i, atual, inteiro;
for (i=10; i<100; i++){

if (i % 10 != 0){
atual = i;
inteiro = atual/10;
if (atual % inteiro == 0){

printf ("%i\n", atual);
    }
}
}

system ("pause");
}
