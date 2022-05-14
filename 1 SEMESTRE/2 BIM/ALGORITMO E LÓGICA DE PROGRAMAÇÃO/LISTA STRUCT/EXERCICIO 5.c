#include <stdio.h>
#include <stdlib.h>

int main(){

    struct horario{
        int h, m, s;
    };

    struct data{
        int dia,mes,ano;
        };
    struct compromisso{
        struct horario hora;
        struct data dd;
        char texto[200];
    }agenda[3];

    int i;
    for(i=0; i<3; i++){
        printf("Informe Dia, Mes e Ano\n");
        scanf("%i", &agenda[i].dd.dia);
         scanf("%i", &agenda[i].dd.mes);
          scanf("%i", &agenda[i].dd.ano);

        printf("Informe Hora, Munuto e Segundo\n");
        scanf("%i", &agenda[i].hora.h);
         scanf("%i", &agenda[i].hora.m);
          scanf("%i", &agenda[i].hora.s);
        printf("COMPROMISSO\n");
        fflush(stdin);
        gets(agenda[i].texto);
    }

    for(i=0; i<3; i++){
    printf("Agenda:\n");
    printf("%i/%i/%i", agenda[i].dd.dia, agenda[i].dd.mes, agenda[i].dd.ano);
    printf("%i:%i:%i", agenda[i].hora.h, agenda[i].hora.m, agenda[i].hora.s);
    printf("%s", agenda[i].texto);

    }
}
