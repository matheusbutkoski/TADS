#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main (){

int qtd, fim, i, soma, ant=0;

printf ("Quantos numeros da sequencia deseja calcular\n");
scanf("%i", &qtd);
qtd = qtd - 2;
printf ("0\n1\n");
for (i=0; i<qtd; i++){
    if (i==0){
        fim = 1;
    }
    soma = fim + ant;
    ant = fim;
    fim = soma;
    printf ("%i\n", fim);
}

system("pause");
}
