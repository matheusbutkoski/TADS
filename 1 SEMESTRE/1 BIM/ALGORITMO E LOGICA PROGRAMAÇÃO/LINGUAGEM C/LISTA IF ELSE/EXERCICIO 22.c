#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main (){

int a, b, c;
float delta;
delta = 0;
printf("Digite o valor de a\n");
scanf("%i", &a);

printf("Digite o valor de b\n");
scanf("%i", &b);

printf("Digite o valor de c\n");
scanf("%i", &c);

delta = pow(b,2) - 4 * a * c;

if (delta >= 0){
printf ("O valor de delta eh: %f\n", delta);
}
if (delta < 0){
printf ("Nao ha raizes reais\n");
}
if (a==0){
printf ("Nao eh equacao de segundo grau\n");
}


system("pause");
}
