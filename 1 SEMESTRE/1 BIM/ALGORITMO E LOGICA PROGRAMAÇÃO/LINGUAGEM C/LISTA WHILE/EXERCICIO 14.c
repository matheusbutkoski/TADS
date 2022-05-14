#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int num, soma, x;
soma = 0;
x = 1;
printf ("Informe um numero inteiro\n");
scanf ("%i", &num);
while (num > x){
 if (num % x == 0){
    soma = soma + x;
}
x = x + 1;
}
printf ("A soma dos divisores desse numero eh %i\n", soma);
system ("pause");
};
