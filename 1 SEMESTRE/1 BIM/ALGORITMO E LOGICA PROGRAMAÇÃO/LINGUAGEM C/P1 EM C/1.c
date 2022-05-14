#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main (){

int inicio, fim, rend;
char op;

do{
printf ("Informe o horario de inicio\n");
scanf ("%i", &inicio);
printf ("Informe o horario de termino\n");
scanf("%i", &fim);

if (fim > inicio){
    rend = fim - inicio;

} else {
  rend = (24 + fim) - inicio;
}


printf ("Parabens seu rendimento foi de %i h \n", rend);
printf ("Deseja consultar novamente?\n");
scanf ("%s", &op);
}while (op == 'S' || op == 's');
system ("pause");
}


