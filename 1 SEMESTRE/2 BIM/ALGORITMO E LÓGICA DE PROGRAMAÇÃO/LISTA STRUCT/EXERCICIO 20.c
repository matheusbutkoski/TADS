#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
int opcao = 0;

float d_pontos = 0;

struct ponto2d{
float x, y;

};

struct ponto_inicial

{

}; struct ponto2d distancia_ini;

struct ponto_final

{

}; struct ponto2d distancia_fim;



while (opcao > 0 || opcao < 5)

{

    printf_s("[1] - Digitar os valores do primeiro ponto.\n");
    printf_s("[2] - Digitar os valores do segundo ponto.\n");
    printf_s("[3] - Mostrar a distancia entre os dois pontos.\n");
    printf_s("[4] - Sair.\n");
    scanf_s("%i", &opcao);

 switch (opcao)

 {

 case 1:

    printf_s("\ninsira o primeiro numero do ponto 1:\n");
    scanf_s("%f", &distancia_ini.x);
    printf_s("\ninsira o segundo numero do ponto 1:\n");
    scanf_s("%f", &distancia_ini.y);

 break;

 case 2:
    printf_s("\ninsira o primeiro numero do ponto 2:\n");
    scanf_s("%f", &distancia_fim.x);
    printf_s("\ninsira o segundo numero do ponto 2:\n");
    scanf_s("%f", &distancia_fim.y);

 break;

 case 3:

    d_pontos = pow((distancia_ini.x - distancia_fim.x), 2) + pow((distancia_ini.y - distancia_fim.y), 2);
    d_pontos = sqrt(d_pontos);
    printf_s("\nA distancia eh: %f\n", d_pontos);
    system("pause");

 break;

 case 4:

 system("pause");

 return 0;

 break;

 default: printf_s("\nEntrada invalida!\n");

 system("pause");
}
}
}
