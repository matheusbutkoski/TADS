#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int i, num, res = 1;
printf ("Digite um numero para ver seu fatorial\n");
scanf ("%i", &num);

for (i=num; i > 1; i--){

res = res * i;

}
printf ("O fatorial de %i eh %i\n", num, res);
system("pause");
}
