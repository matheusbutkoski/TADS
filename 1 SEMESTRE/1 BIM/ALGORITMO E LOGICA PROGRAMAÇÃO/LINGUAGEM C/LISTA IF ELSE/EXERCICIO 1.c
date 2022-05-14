#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {

float num, tri, quad;

printf("Escreva um numero/n");
scanf("%f", &num);
if (num > 0){
tri = num * 3;
printf("O triplo desse numero eh %f /n", tri);
}
else{
quad = pow(num, 2);
printf("O quadrado desse numero eh %f /n", quad);
}
system("pause");
}
