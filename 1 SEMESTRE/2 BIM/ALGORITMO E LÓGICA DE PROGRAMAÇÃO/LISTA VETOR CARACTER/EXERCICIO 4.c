#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
char senha[15];
int i, tam, cont_num=0, cont_let=0;

printf ("Informe uma senha com 8 caracteres, entre eles letras e numeros\n");
gets(senha);
fflush(stdin);
tam = strlen(senha);

for(i=0;senha[i]!= '\0'; i++){

if(senha[i] == '0' || senha[i] == '1' || senha[i] == '2' || senha[i] == '3' || senha[i] == '4' || senha[i] == '5' || senha[i] == '6' || senha[i] == '7' ||senha[i] == '8' ||senha[i] == '9'){
    cont_num++;
}else{
    cont_let++;
}
}
if(tam == 8 && cont_num != 0 && cont_let != 0){
  printf ("Senha Valida\n");
}else{
    printf ("Senha Invalida\n");
}




system("pause");
}
