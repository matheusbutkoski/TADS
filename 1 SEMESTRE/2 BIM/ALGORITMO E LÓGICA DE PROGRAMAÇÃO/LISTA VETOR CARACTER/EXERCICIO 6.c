#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){


int cont=0, tam, i;
char palavra[50], letra;

printf ("Informe uma palavra\n");
gets(palavra);
fflush(stdin);

printf ("Informe uma letra\n");
scanf("%c", &letra);
fflush(stdin);

tam = strlen(palavra);

for(i=0; i < tam; i++){
    if(palavra[i] == letra){
        cont++;
    }
}

printf ("A letra %s aparece %i vezes\n", letra, cont);
system("pause");
}
