#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main () {
char sexo;
int idade;

printf ("Informe o sexo F ou M \n");
scanf ("%s", &sexo);
printf ("Informe a idade \n");
scanf ("%i", &idade);

if ((sexo == 'F' || sexo =='f') && idade < 25){
    printf ("Aceita\n");
}else {
printf ("Nao aceita\n");
}


system ("pause");
}
