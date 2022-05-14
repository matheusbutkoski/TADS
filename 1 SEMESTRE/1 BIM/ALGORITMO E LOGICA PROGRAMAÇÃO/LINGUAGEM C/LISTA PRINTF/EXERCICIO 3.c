#include <stdio.h>
#include <stdlib.h>

int main () {

float res, dis, qtd;


printf ("Informe a distancia percorrida\n");
scanf ("%f", &dis);
printf ("Informe a quantidade de combustivel gasta no percurso\n");
scanf ("%f", &qtd);

res = dis / qtd;

printf ("O consumo medio do seu carro eh %f Km/L\n", res);
system ("pause");




}
