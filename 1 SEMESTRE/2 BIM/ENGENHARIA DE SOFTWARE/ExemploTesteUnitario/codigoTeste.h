#pragma once

int elevarAoQuadrado(int x) {
    return x * x;
}

float divisaoDoisNumerosInteiros(int dividendo, int divisor) {

    float resultado = (float)dividendo / divisor;
    printf("Resultado da divisão: %.2f \n", resultado);

    return resultado;
}

bool VerificarNumeroPrimo(int num, int i, int cont=0) {


    for (i = 1; i < num; i++) {
        if (num % i == 0) {
            cont++;
        }
    }
    if (cont <= 2) {
        printf("O numero eh primo\n");
    }
    else {
        printf("O numero nao eh primo\n");
    }

    system("pause");

}