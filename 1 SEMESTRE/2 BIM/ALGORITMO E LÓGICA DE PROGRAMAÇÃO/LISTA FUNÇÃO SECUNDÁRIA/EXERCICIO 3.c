#include <stdio.h>
#include <stdlib.h>
#include <math.h>

float calc (float A, float B, float C){
    float delta;
    delta = (B*B) - 4*A*C;
    return delta;
}

int main (){
    float A, B, C, delta;
    printf ("Informe Valores para A, B, C\n");
    scanf("%f%f%f", &A, &B, &C);
    delta = calc(A,B,C);
    printf ("O valor de delta eh %f\n,", delta);
    system("pause");

}







