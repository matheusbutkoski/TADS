#include <stdlib.h>
#include <stdio.h>



int main(){

int x, soma, media, num;

x = 1;
soma = 0;

while (x <= 10){
printf ("Digite o %i numero\n", x);
scanf ("%i", &num);
soma = soma + num;
x = x + 1;
};

media = soma / 10;
printf ("A soma dos numeros eh %i\n", soma);
printf ("A media dos numeros eh %i\n", media);

system ("pause");
};
