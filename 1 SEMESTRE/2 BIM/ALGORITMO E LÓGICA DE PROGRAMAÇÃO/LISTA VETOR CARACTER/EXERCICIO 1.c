#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (){

int i, cont=0, tam;
char palavra[20], letra;

printf("Informe uma palavra\n");
gets(palavra);
fflush(stdin)
printf ("Informe uma letra\n");
scanf("%s", &letra);
tam = strlen(palavra);

for(i=0; i < tam; i++){
if(palavra[i] == letra){
cont++;
}
}

if(cont >= 1){
    printf("A letra esta contida na palavra\n");
} else{
    printf("A letra nao esta contida na palavra\n");
}

system("pause");
}
