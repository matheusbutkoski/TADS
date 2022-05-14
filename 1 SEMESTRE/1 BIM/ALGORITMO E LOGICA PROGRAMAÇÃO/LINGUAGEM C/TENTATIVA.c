#include <stdio.h>
#include <stdlib.h>
int main(){

int c, l, m, a;
printf ("Informe o numero de linhas\n");
scanf ("%i", &l);
printf ("Informe o numero de colunas\n");
scanf ("%i", &c);

a = 1;
while (a <= l){
m = 1;
while (m <= c){
printf ("*"),
m = m + 1;
}
a = a + 1;
printf ("\n");
}

system("pause");
}
