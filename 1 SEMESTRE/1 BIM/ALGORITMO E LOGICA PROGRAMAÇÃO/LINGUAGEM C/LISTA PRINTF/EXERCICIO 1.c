#include<stdio.h>
#include<stdlib.h>

int main () {
float n1, n2, result;

printf ("Informe primeiro valor\n");
scanf("%f", &n1);
printf ("Informe o segundo valor\n");
scanf("%f", &n2);
result = n1 + n2;

printf ("A soma dos numeros eh %f \n", result);
result = n1 - n2;
printf ("A subtracao dos numeros eh %f \n", result);
result = n1 * n2;
printf ("A multiplicacao dos numeros eh %f \n",result);
result = n1 / n2;
printf ("A divisao dos numeros eh %f \n", result);
system ("pause");



}
