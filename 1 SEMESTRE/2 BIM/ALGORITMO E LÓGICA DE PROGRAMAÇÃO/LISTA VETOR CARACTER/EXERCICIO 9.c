#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main (){

int tam,i, cont=0;
char nome[100];

printf ("Informe seu nome completo\n");
gets(nome);
fflush(stdin);

tam = strlen(nome);

for(i=0;i<tam;i++){
if(nome[i] == ' '){
    cont++;
}
}
printf ("%i\n", tam - cont);

system("pause");
}
