
#include <stdio.h>

int vetor[5] = {5, 4, 3, 2, 1 };
//função de divisão
float divisaoDoisNumerosInteiros(int dividendo, int divisor){

    float resultado = (float) dividendo/divisor;
    printf("Resultado da divisão: %.2f \n", resultado);

    return resultado;
}

int elevarAoQuadrado(int x){
    return x * x;
}

void ordenarVetor(){
    int i = 0;
    int j = 0;
    int aux = 0;
    for(i = 0; i < 4; i++){
        for(j = i+1; j <= 4; j++){
            if(vetor[i] > vetor[j]){
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
        }
    }
}

void exibirVetor(){
    int i = 0;
    for(i = 0; i <= 4; i++){
        printf("%i ", vetor[i]);
    }
}

int main(){
    int dividendo, divisor, x;

    printf("digite o dividendo: ");
    scanf("%i", &dividendo);

    printf("digite o divisor: ");
    scanf("%i", &divisor);

    divisaoDoisNumerosInteiros(dividendo, divisor);

    printf("digite um valor para ser elevado ao quadrado: ");
    scanf("%i", &x);
    x = elevarAoQuadrado(x);
    printf("valor elevado ao quadrado: %i \n", x);

    ordenarVetor();
    exibirVetor();
    return 0;
}



