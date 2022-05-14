#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int num, i, soma=0;

printf ("Digite um numero para verificar se eh perfeito\n");
scanf ("%i", &num);

for (i=1; num > i; i++){
if (num % i == 0){
    soma = soma + i;
    }
}
if (num == soma){
    printf ("O numero eh perfeito\n");
}else {
    printf ("O numero nao eh perfeito\n");
}

system ("pause");
}
