#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int i, num;
printf ("Informe um numero para ver seus divisores\n");
scanf("%i", &num);

for (i=1; i < num; i++){
if (num % i == 0){
    printf ("%i\n", i);
}
}system("pause");
}
