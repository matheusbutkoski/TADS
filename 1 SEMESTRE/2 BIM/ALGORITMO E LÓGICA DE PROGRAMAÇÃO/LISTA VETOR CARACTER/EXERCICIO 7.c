#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){

int i, tam;
char txt[100];


printf("Informe um texto\n");
gets(txt);
fflush(stdin);

tam = strlen(txt);

for(i=0; i<tam; i++){
    if(txt[i] == ' '){
        printf(" ");
    }else{
printf("%c%c", txt[i], txt[i]);
}
}
printf("\n");
system("pause");
}
