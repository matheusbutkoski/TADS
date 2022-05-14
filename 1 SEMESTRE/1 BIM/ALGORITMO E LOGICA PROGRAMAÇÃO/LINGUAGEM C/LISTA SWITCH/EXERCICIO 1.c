#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

float n1, n2;
char op, opcao;
do{
printf ("Digite o primeiro numero\n");
scanf ("%f", &n1);
printf ("Digite a operaçao +, -, X, /\n");
scanf("%s", &op);
printf ("Digite o segundo numero\n");
scanf ("%f", &n2);

switch (op){

case '+':
  printf ("%f\n", n1 + n2);
  break;
case '-':
  printf ("%f\n", n1 - n2);
  break;
case 'X':
  printf ("%f\n", n1 * n2);
  break;
case '/':
  printf ("%f\n", n1 / n2);
  break;

default:
printf ("Operação inválida\n");
break;
}
printf ("Deseja calcular novamente\n");
scanf("%s", &opcao);
}while(opcao == 'S' || opcao == 's');

system ("pause");
}
