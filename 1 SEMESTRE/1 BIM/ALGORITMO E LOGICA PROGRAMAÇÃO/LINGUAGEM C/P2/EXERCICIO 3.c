#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int num, x, soma = 0;
printf ("Digite um numero\n");
scanf ("%i", &num);
x = 1;
while (num > x){
if (num % x == 0){
    soma = soma + x;
}
x = x + 1;
}
if (num == soma){
    printf ("O numero eh perfeito\n");
}else {
printf ("O numero nao eh perfeito\n");
}
system ("pause");
}
