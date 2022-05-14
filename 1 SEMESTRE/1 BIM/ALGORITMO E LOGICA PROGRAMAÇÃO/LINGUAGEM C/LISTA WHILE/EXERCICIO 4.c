#include <stdlib.h>
#include <stdio.h>
#include <math.h>


int main () {

int x, num, maior;

maior = 0;
x = 1;
while (x <= 10) {
printf ("Digite o %i numero\n", x);
scanf ("%i", &num);
x = x + 1;

if (num > maior) {
maior = num;
};
};
printf("O maior numero eh %i", maior);

system ("pause");
};
