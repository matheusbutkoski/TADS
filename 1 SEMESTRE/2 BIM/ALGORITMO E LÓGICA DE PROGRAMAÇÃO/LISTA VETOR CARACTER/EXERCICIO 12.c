#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main (){

int i, tam, cont=0;
char usu[50], sen1[20], sen2[20];

printf ("Digite seu nome de usuario\n");
gets(usu);
fflush(stdin);

printf ("Digite uma senha\n");
gets (sen1);
fflush(stdin);


printf ("Digite novamente sua senha\n");
gets(sen2);
fflush(stdin);

tam = strlen(sen1);


for (i=0; i<tam; i++){
 if (sen1[i] == sen2[i]){
    cont++;
 }
}
 if (cont == tam){
    printf ("Senha valida\n");
 }else{
 printf ("Senha invalida\n");
 }



system ("pause");
}
