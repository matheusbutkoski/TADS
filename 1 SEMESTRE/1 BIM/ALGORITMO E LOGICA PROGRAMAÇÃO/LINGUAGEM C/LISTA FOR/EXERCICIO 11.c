#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main (){

int b, n, i, res = 1;

printf ("Informe o valor da base (maior que 1)\n");
scanf ("%i", &b);

printf ("Informe o valor do expoente (maior ou igual a 2)\n");
scanf ("%i", &n);

if (b>1 && n>=2){

for (i=0; i<n; i++){
    res = res * b;
}
printf ("Resultado: %i\n", res);
}else{
printf ("Valores invalidos\n");
}

system("pause");
}
