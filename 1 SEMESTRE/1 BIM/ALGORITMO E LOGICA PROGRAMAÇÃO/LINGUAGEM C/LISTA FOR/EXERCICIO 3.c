#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){

int num, maior, i;
printf ("Digite 10 numeros\n");
maior = 1;
for (i=0; i<10; i++){
    scanf ("%i", &num);
   if (num > maior){
    maior = num;
   }
}
printf ("O maior numero digitado foi %i\n", maior);
system("pause");
}
