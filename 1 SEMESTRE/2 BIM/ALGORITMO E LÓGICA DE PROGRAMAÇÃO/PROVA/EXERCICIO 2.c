#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (){

char nome[50];
int pos1, pos2, i, tam, pos3;

printf("Informe seu nome completo\n");
gets(nome);
fflush(stdin);

tam= strlen(nome);


for(i=0; nome[i] != ' '; i++){
    pos1 = i;
}


for(i=tam-1; nome[i] != ' '; i--){
    pos2 = i;
}





printf("%c%c%c@univel.br\n", nome[0], nome[pos1+2], nome[pos2]);




system("pause");
}
