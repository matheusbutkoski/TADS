#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int num, x, cont = 0;
x = 1;
printf ("Informe um n\243mero inteiro maior que 1\n");
scanf("%i", &num);
while (x < num){
  if (num % x == 0){
    cont = cont + 1;
};
x = x + 1;
}
if (cont <= 2){
 printf("O n\243mero eh primo\n");
 }else{
 printf ("O n\243mero nao eh primo\n");
 }
system ("pause");
}
