#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main (){

int x, base, exp, res = 1;

printf ("Informe o valor da base\n");
scanf ("%i", &base);

printf ("Informe o valor do expoente\n");
scanf ("%i", &exp);


while (exp > 0){
res = res * base;
exp = exp - 1;


}
printf ("Resultado:%i\n", res);
system ("pause");
}
