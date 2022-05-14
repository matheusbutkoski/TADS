#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){
    int i, num;
    float fat = 1, res = 1;

    printf("Digite um numero\n");
    scanf("%i", &num);

    for (i=1; i<=num; i++){
        fat = fat * i;
        res = res + 1/fat;
    }
printf("O valor de E eh: %f\n", res);

}
