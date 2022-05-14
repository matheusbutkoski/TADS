#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main () {
int x, cont, num;

x = 1;
cont = 0;

printf ("Informe um numero\n");
scanf ("%i", &num);

while (cont < num) {
 if (x % 2 == 0) {
cont = cont + 1;
printf ("%i\n", x);
};
x = x + 1;
};

system ("pause");
}

