#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int i;
float massa, tempo=0, inicial, min, horas;

printf ("Informe a massa inicial em gramas\n");
scanf ("%f", &massa);
inicial = massa;

for(i=1; massa>0.05; i++){

 massa = massa / 2;
 tempo = tempo + 50;
}

min = tempo / 60;
horas = min / 24;
printf ("A massa inicial eh %.2f g\n", inicial);
printf ("A massa final eh %.2f g\n", massa);
printf ("O tempo em segundos eh %.2f s\n", tempo);
printf ("O tempo em minutos eh %.2f min\n", min);
printf ("O tempo em horas eh %.2f h\n h", horas);

system ("pause");
}
