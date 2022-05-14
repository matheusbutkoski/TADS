#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main () {

int num;


printf ("Digite varios números, quando quiser parar digite um numero negativo\n");

do{
scanf ("%i", &num);
}
while (num > 0);
system ("pause");
}
