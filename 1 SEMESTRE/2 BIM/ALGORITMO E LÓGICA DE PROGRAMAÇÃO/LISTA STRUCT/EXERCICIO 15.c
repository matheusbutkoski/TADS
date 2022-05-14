#include <stdio.h>
#include <locale.h>
#include <string.h>

int main() {
setlocale(LC_ALL,"");
int i;
int quanti[25],j;
char receita[25];

struct receitas
{
char nome[25],ingredientes[200];
   int quant;

}rec[2];

for (i=0; i<2; i++)
{
    printf ("Nome:\n");
    fflush(stdin);
    gets(rec[i].nome);

    printf("Quantidade de ingredientes:\n");
    scanf("%i", &rec[i].quant);

    for (j=0; j<rec[i].quant; j++)
{
    printf("Ingredientes:\n");
    scanf("%s", &rec[j].ingredientes);
    printf("Quantidade:\n");
    scanf("%i", &quanti[j]);

}
}
do{
printf ("Qual receita vc procura?\n");
fflush(stdin);
gets(receita);
printf("----------------\n");
for(i=0;i<2; i++){
if (strcmp(rec[i].nome,receita))
    {

    }
else
    {
        printf("Receita encontrada!\n");
        printf("%s\n", rec[i].nome);
        printf("Ingredientes:\n");

            for (j=0; j<rec[i].quant; j++)
   {

    printf("%s\n",rec[j].ingredientes);
   }

   }
    }
}while(receita != " ");
system("pause");
}
