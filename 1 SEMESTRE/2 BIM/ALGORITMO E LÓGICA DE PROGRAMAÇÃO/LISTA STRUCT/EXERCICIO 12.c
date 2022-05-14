#include <stdio.h>
#include <stdlib.h>

int main(){

int i,m,a;

struct data{

    int dia, mes, ano;

};

struct info{

    char compromisso[60];
    struct data dd;

}agenda[5];

for(i=0;i<5;i++){

    printf("Informe o DIA do compromisso\n");
    scanf("%i", &agenda[i].dd.dia);

    printf("Informe o MES do compromisso\n");
    scanf("%i", &agenda[i].dd.mes);

    printf("Informe o ANO do compromisso\n");
    scanf("%i", &agenda[i].dd.ano);

    fflush(stdin);
    printf("Descreva o Compromisso:\n");
    gets(agenda[i].compromisso);
    fflush(stdin);
}

do{
printf("Informe o MES que deseja ver os compromissos\n");
scanf("%i", &m);


printf("Informe o ANO que deseja ver os compromissos\n");
scanf("%i", &a);

printf("Compromissos do MES %i do ano %i:\n", m, a);


for(i=0;i<5;i++){
if (agenda[i].dd.mes == m && agenda[i].dd.ano == a){
    printf("%s\n", agenda[i].compromisso);

}

}
}while(m != 0);
system("pause");
}
