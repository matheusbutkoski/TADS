#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int num, soma = 0, cont = 0, maior, menor, media = 0;
maior = 1;
do{
printf ("Digite uma sequencia de numeros, e quando quiser parar digite 0\n");
scanf ("%i", &num);
if (num != 0){

soma = soma + num;
cont = cont + 1;

if (num > maior){
maior = num;

}
if (num < menor){
menor = num;
}
}
}while (num != 0 && soma < 1000);
printf ("O maior numero eh: %i\n", maior);
printf ("O menor numero eh: %i\n", menor);
printf ("A media eh: %i\n", soma / cont);
system ("pause");
}
