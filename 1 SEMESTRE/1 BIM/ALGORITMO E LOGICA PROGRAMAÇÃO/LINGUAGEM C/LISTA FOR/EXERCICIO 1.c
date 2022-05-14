#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int i, num;

printf ("Digite um numero para ver sua tabuada\n");
scanf ("%i", &num);

for (i=1; i<=10; i++){
printf ("%i x %i = %i\n", num, i, num * i);
}
system("pause");
}
