#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main (){
int lados;

printf ("Informe o numero de lados da forma geometrica\n");
scanf ("%i", &lados);

switch (lados){

case 3:
    printf ("Triangulo\n");
    break;
case 4:
    printf ("Quadrado\n");
    break;
case 5:
    printf ("Pentagono\n");
    break;
case 6:
    printf ("Hexagono\n");
    break;
default:
    printf("Quantidade invalida");
}
system ("pause");
}
