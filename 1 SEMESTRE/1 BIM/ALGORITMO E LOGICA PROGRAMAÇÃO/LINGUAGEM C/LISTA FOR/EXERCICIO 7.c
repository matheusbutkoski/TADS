#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main (){
int p_int, p_fra, i, soma, pot;

for (i=1000; i<=9999; i++){
 p_int = i/100;
 p_fra = i % 100;
 soma = p_int + p_fra;
 pot = soma * soma;

 if (pot == i){
    printf ("Possui mesma caracteristica do numero 3025\n");
    printf ("%i + %i - %i, %i x %i - %i\n", p_int, p_fra, soma, soma, soma, pot);

 }

}





system ("pause");
}
