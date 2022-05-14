#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int i, n1, n2, atual, ant1, ant2;

printf ("Informe o primeiro termo\n");
scanf ("%i", &n1);

printf("Informe o segundo termo\n");
scanf ("%i", &n2);

printf ("%i\n%i\n", n1, n2);
for(i=3; i<10; i++){

 if (i==3){
ant1 = n1;
ant2 = n2;

}
if (i % 2 == 0){
atual = ant1 + ant2;

}else{
atual = ant1 - ant2;


}
ant1 = ant2;
ant2 = atual;
printf ("%i - %i\n", i, atual);
}
system ("pause");
}
