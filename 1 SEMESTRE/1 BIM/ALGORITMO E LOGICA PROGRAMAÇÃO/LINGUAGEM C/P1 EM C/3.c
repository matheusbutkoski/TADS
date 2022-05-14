#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int saque, cont100 = 0, cont50 = 0, cont20 = 0, cont10 = 0, cont1 = 0;

printf ("Informe o valor do saque\n");
scanf("%i", &saque);

while (saque >= 100){
cont100 = cont100 + 1;
saque = saque - 100;
}

while (saque >= 50){
cont50 = cont50 + 1;
saque = saque - 50;
}

while (saque >= 20){
cont20 = cont20 + 1;
saque = saque - 20;
}

while (saque >= 10){
cont10 = cont10 + 1;
saque = saque - 10;
}

while (saque >= 1){
cont1 = cont1 + 1;
saque = saque - 1;
}
printf ("Notas de R$ 100,00: %i\n", cont100);
printf ("Notas de R$ 50,00: %i\n", cont50);
printf ("Notas de R$ 20,00: %i\n", cont20);
printf ("Notas de R$ 10,00: %i\n", cont10);
printf ("Notas de R$ 1,00: %i\n", cont1);
system ("pause");
}
