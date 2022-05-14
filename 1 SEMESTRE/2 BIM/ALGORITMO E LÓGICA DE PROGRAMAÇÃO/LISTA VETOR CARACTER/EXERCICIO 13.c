#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main (){

int i, tam, cont=0;
char s1[20], s2[20], conc;

printf ("Informe uma string\n");
gets(s1);
fflush(stdin);

printf ("Informe outra string\n");
gets(s2);
fflush(stdin);

tam = strlen(s1);


for (i=0; i<tam; i++){
    if(s1[i] == s2[i]){
        cont++;
        }
}
if(cont == tam){
    printf ("Strings iguais\n");
}else{
    strcat(s1, s2);
    printf ("%s\n", s1);
}




system("pause");
}
