#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (){
char pai[100], mae[100], filho[100], sobrenome[100];

printf ("Informe o nome do pai\n");
gets(pai);
fflush(stdin);

printf ("Informe o nome da mae\n");
gets(mae);
fflush(stdin);

printf ("Informe o nome do filho\n");
gets(filho);
fflush(stdin);

printf ("Informe o sobrenome da familia\n");
gets(sobrenome);
fflush(stdin);

strcat(pai," ");
strcat(mae," ");
strcat(filho," ");

strcat(pai,sobrenome);
strcat(mae,sobrenome);
strcat(filho,sobrenome);

printf ("Pai: %s\n", pai);
printf ("Mae: %s\n", mae);
printf ("Filho: %s\n", filho);

system("pause");
}
