#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define PI  3,14

int main () {

float raio, area;

printf ("Informe o valor do raio\n");
scanf ("%f", &raio);

area = pow(raio, 2) * PI;

printf ("O valor da area eh %f \n", area);
system ("pause");








}
