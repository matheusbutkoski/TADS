#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int num, i;

printf ("Digite um numero\n");
scanf ("%i", &num);

for (i=0;i<num;i++){
if (i % 2 != 0){
printf ("%i\n", i);

}
}
system("pause");

}
