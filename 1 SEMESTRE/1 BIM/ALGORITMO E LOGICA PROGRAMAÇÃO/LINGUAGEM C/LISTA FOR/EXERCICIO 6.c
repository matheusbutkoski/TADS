#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int num, i, cont1=0, cont2=0, x;
printf ("Informe um numero inteiro\n");
scanf ("%i", &num);

printf ("Primeiros %i numeros pares\n", num);
for (i=1; cont1<num; i++){

if (i % 2 == 0){
    printf ("%i\n", i);
    cont1 = cont1 + 1;

}
}
printf ("Primeiros %i numeros impares\n", num);
for (x=1; cont2<num; x++){

if (x % 2 == 1){
    printf ("%i\n", x);
    cont2 = cont2 + 1;

}
}
system ("pause");
}
