#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main (){

int maior, menor, num, i, cont;
maior = 1;
printf ("Informe quantos numeros deseja digitar\n");
scanf ("%i", &cont);

for (i=0; i<cont; i++){
printf ("Digite o numero\n");
scanf("%i", &num);

if(num > maior){
maior = num;
}
if (num < menor){
menor = num;
}
}
printf ("O maior numero eh %i\n", maior);
printf ("O menor numero eh %i\n", menor);



system ("pause");
}
