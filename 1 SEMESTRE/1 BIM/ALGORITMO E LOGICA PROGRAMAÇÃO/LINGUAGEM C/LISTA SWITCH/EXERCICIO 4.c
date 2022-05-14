#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main (){

int idade;

printf ("Informe a idade\n");
scanf("%i", &idade);

switch(idade){

case 1 ... 9:
  printf ("O valor a ser pago eh R$ 180,00\n");
break;

case 10 ... 30:
    printf ("O valor a ser pago eh R$ 150,00\n");
break;

case 40 ... 59:
    printf ("O valor a ser pago eh R$ 195,00\n");
break;

case 60 ... 150:
    printf ("O valor a ser pago eh R$ 230,00\n");
break;

default:
    printf ("Idade invalida\n");


}
system ("pause");
}
