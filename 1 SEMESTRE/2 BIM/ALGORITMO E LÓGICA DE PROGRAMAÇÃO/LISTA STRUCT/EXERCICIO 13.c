#include <stdio.h>
#include <stdlib.h>

int main(){

    int i, t;
    float consumo, consumoT, d;

struct casa{

    char nome[15];
    float potencia;
    float tempo;
}eletro[5];

for(i=0;i<5;i++){

fflush(stdin);
printf("Informe o nome do Eletrodomestico\n");
gets(eletro[i].nome);
fflush(stdin);

printf("Infome o potencia em kW\n");
scanf("%f", &eletro[i].potencia);

printf("Informe o tempo de consumo diario em H\n");
scanf("%f", &eletro[i].tempo);
}

printf("Informe o numero de dias que deseja consultar o consumo\n");
scanf("%i", &t);

for(i=0;i<5;i++){

  consumo = (eletro[i].potencia * eletro[i].tempo/24) * t;
  consumoT = consumoT + consumo;
}
printf("------------------\n");
for(i=0;i<5;i++){
    d = eletro[i].potencia * eletro[i].tempo/24;
  printf("Nome: %s\n", eletro[i].nome);
  printf("Porcentagem de consumo no tempo: %.2f%%\n", (d * t)/ consumoT);
  printf("------------------\n");
}
printf("Consumo Total no Periodo: %f\n", consumoT);
system("pause");
}
