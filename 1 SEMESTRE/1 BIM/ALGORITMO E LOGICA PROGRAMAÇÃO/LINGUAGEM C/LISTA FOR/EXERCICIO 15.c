#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main (){

int i;
float soma=0, impar=1;

for(i=1; i<=50; i++){
soma = soma + (impar/i);
printf ("%.0f/ %i\n", impar, i);
impar = impar + 2;
}
printf("A soma total eh: %2.f\n,", soma);

system("pause");
}
