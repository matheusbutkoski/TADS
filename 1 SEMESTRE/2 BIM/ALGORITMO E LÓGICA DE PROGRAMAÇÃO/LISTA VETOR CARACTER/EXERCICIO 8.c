#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){

char nome[50];
int i, tam, pos;
printf("Informe nome completo\n");
gets(nome);
fflush(stdin);
tam = strlen(nome);

for(i = tam-1; nome[i] != ' '; i--){
    pos = i;
}
for(i=pos; nome[i] != '\0'; i++){
    printf ("%c", nome[i]);

}
printf("\n");
system("pause");
}
