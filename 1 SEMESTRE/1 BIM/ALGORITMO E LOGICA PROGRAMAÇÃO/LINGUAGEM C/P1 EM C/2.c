#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

float total = 0;
char estado, op;

do{
printf ("Informe o valor total do pedido\n");
scanf ("%f", &total);
printf ("Informe o destino do produto\n");
scanf ("%s", &estado);


if (estado == 'M' || estado == 'm'){
 printf ("O valor total sera %f\n", total * 1.07);
}
if (estado == 'S' || estado == 's'){
 printf ("O valor total sera %f\n", total * 1.12);
}
if (estado == 'R' || estado == 'r'){
 printf ("O valor total sera %f\n", total * 1.15);
}
if (estado == 'T' || estado == 't'){
 printf ("O valor total sera %f\n", total * 1.08);
}else{
printf ("Estado invalido\n");
}


printf ("Deseja Consultar novamente? S/N\n");
scanf ("%s", &op);
}while (op == 'S' || op == 's');

system ("pause");
}
