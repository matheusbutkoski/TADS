#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){

char palavra[20];
int i, cont=0;

printf ("Informe uma palavra\n");
gets(palavra);

for(i=0; i<strlen(palavra); i++){
if(palavra[i] == 'a' || palavra[i] == 'A' || palavra[i] == 'e' || palavra[i] == 'E' || palavra[i] == 'i'
       || palavra[i] == 'I' || palavra[i] == 'o' || palavra[i] == 'O' || palavra[i] == 'u' || palavra[i] == 'U'){
cont = cont + 1;
}
}

printf ("A palavra possui %i vogais\n", cont);
system("pause");
}
