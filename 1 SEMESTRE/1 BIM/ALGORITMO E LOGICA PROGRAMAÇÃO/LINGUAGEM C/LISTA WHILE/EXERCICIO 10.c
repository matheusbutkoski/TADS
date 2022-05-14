#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main () {

int a, m , l, c;

printf ("Digite a quantidade de linhas\n");
scanf ("%i", &l);

printf ("Digite a quantidade de colunas\n");
scanf ("%i", &c);

a = 1;
while (a <= l){
    m = 1;
    while (m <= c){
        printf ("*");
    m = m + 1;
    };
a = a + 1;
printf ("\n");
};
printf ("\n");
system ("pause");
}
