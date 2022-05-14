#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main () {
int n, x;

printf ("Informe um valor\n");
scanf ("%i", &n);

while (n>=1){
x = 1;

while (x<=n){
printf ("*");
x = x + 1;
}

n = n - 1;
printf ("\n");
}
printf ("\n");
system ("pause");
}
