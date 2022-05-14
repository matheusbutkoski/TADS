#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main (){

float valor;
char moeda;

printf ("Insira a quantidade a ser convertida\n");
scanf("%f", &valor);
printf ("Escolha para qual moeda deseja converter\n");
scanf ("%s", &moeda);

if (moeda == 'F'){
  printf ("R$ %f\n", valor * 5.78);
}
if (moeda == 'L'){
    printf ("R$ %f\n", valor * 7,31);
}
if (moeda == 'D'){
    printf ("R$ %f\n", valor * 5,35);
}
if (moeda == 'M'){
    printf ("R$ %f\n", valor * 6);
}






system("pause");
}
