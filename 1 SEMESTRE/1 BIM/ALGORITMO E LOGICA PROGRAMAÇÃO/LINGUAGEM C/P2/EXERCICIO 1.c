#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int inicio, fim, lit, valor;
float media = 0, lucro = 0;
char op;
do{
printf ("Informe a marcacao no inicio do dia\n");
scanf ("%i", &inicio);
printf ("Informe a marcacao no fim do dia\n");
scanf ("%i", &fim);
printf ("Informe o numero de litros gastos\n");
scanf ("%i", &lit);
printf ("Informe o valor recebido dos passageiros\n");
scanf ("%i", &valor);

media = (fim - inicio) / lit;
lucro = valor - (lit * 6.02);

printf ("A media de consumo no dia foi de %f KM/L\n", media);
printf ("O lucro do dia foi de R$%f\n", lucro);

printf ("Deseja consultar novamente? S/N\n");
scanf ("%s", &op);
}while (op == 'S' || op == 's');
system ("pause");
}
