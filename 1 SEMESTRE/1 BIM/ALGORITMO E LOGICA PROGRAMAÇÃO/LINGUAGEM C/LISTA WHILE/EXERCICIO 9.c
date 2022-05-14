#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

float renda;
char op;

do{
printf ("Digite sua renda\n");
scanf("%f", &renda);

if (renda < 1637.11){
  printf ("Seu imposto eh isento\n");
};
 if (renda > 1637.12 && renda < 2453.50){
  printf ("Voce deve pagar R$ %f\n", renda * 0.075);
};
if (renda > 2453.51 && renda < 3271.80){
printf ("Voce deve pagar R$ %f\n", renda * 0.15);
};
if (renda > 3271.39 && renda < 4087.65){
printf ("Voce deve pagar R$ %f\n", renda * 0.225);
};
if (renda > 4087.66){
printf ("Voce deve pagar R$ %f\n", renda * 0.275);
};

printf ("Deseja consultar novamente S/N\n");
scanf("%s", &op);

}while (op == 'S' || op == 's');
system ("pause");
}
