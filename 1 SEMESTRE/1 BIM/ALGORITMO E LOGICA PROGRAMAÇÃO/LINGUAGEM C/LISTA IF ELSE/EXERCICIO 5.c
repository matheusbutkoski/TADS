#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){
int num;
float raiz;
printf ("Digite um numero\n");
scanf ("%i", &num);
raiz = sqrt(num);
if (num % 2 == 0){
printf ("A raiz quadrada desse numero eh %f\n", raiz);
}else{
printf ("A metade desse numero eh %i\n", num / 2);
}

system("pause");
}
