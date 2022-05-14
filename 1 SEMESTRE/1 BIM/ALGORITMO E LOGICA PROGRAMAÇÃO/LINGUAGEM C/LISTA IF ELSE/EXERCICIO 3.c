#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int x, y, z;

printf ("Digite o primeiro numero\n");
scanf ("%i", &x);
printf ("Digite o segundo numero\n");
scanf ("%i", &y);
printf ("Digite o terceiro numero\n");
scanf ("%i", &z);

if (x >= y && x >= z && y >= z){
printf ("A ordem crescente eh %i, %i, %i\n", z, y, x);
}
else if (x >= y && x >= z && z >= y){
printf ("A ordem crescente eh %i, %i, %i\n", y, z, x);
}

if (y >= x && y >= z && z >= x){
printf ("A ordem crescente eh %i, %i, %i\n", x, z, y);
}
else if (y >= x && y >= z && x >= z) {
printf ("A ordem crescente eh %i, %i, %i\n", z, x, y);
}

if (z >= y && z >= x && y >= x) {
printf ("A ordem crescente eh %i, %i, %i\n", x, y, z);
}
else if (z >= y && z >= x && x >= y){
printf ("A ordem crescente eh %i, %i, %i\n", y, x, z);
}
system("pause");
}
