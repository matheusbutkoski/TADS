#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main (){

char tipo;
float raio, pi = 3.14;
int base, altura, lado;

printf ("C - Area do Circulo\n");
printf ("R - Area do Retangulo\n");
printf ("Q - Area do Quadrado\n");
scanf ("%s", &tipo);

switch (tipo){
case 'C':
printf ("Informe o raio do circulo\n");
scanf ("%f", &raio);

printf ("A area do circulo eh %f\n", 3.14 * (raio * raio));
break;

case 'R':
printf ("Informe a base do retangulo\n");
scanf ("%i", &base);
printf ("Informe a altura do triangulo\n");
scanf ("%i", &altura);

printf ("A area do retangulo eh %i\n", base * altura);
break;

case 'Q':
printf ("Informe o lado do quadrado\n");
scanf ("%i", &lado);

printf ("A area do quadrado eh %i\n", lado * lado);
break;

default:
printf ("Forma geometrica invalida");
}


system ("pause");
}
