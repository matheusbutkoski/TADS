#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int id;

printf ("Digite sua idade\n");
scanf ("%i", &id);

if (id == 17 || id == 16){
 printf ("Seu voto eh facultativo\n");
}
if (id >= 18 && id <= 70){
printf ("Seu voto eh obrigatorio\n");
}
if (id > 70){
printf ("Seu voto eh facultativo\n");
}
if (id < 16){
printf ("Voce ainda nao pode votar\n");
}
system ("pause");
}

