#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){

int i, tam;
char txt[200];

printf("Informe o texto a ser decodificado\n");
gets(txt);
fflush(stdin);

tam = strlen(txt);

for(i=0;i<tam;i++){

   if (txt[i] == 'K' || txt[i] == 'k'){
    txt[i] = 't';
   }
     if (txt[i] == 'z'){
    txt[i] = 'a';
   }
     if (txt[i] == 'y'){
    txt[i] = 'e';
   }
     if (txt[i] == 'w'){
    txt[i] = 'o';
   }
     if (txt[i] == 'b'){
    txt[i] = 'm';
   }
    if (txt[i] == 'd'){
    txt[i] = 'n';
   }
    if (txt[i] == 'f'){
    txt[i] = 'p';
   }
}
printf("%s\n", txt);





system("pause");
}
