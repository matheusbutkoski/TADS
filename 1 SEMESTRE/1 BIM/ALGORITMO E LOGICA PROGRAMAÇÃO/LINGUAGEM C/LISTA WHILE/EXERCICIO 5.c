#include <stdlib.h>
#include <stdio.h>
#include <math.h>


int main () {
int x, num, tab;

x = 1;
printf ("Digite um numero para ver sua tabuada\n");
scanf ("%i", &num);

while (x <= 10){
tab = num * x;

printf ("%i x %i = %i\n", num, x, tab);

x = x + 1;
};
system ("pause");
}
