#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int cont = 0;
float soma, num;

do {
printf ("Escreva um numero e quando quiser parar digite 0\n");
scanf ("%f", &num);

if (num >= 0){
soma = soma + num;
}else {
cont = cont + 1;
}
}while (num != 0);
printf ("A soma dos positivos eh %f\n", soma);
printf ("A quantidade de negativos eh %i\n", cont);
system("pause");
}
