#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

int macas;
printf ("Digite quantas maças deseja comprar\n");
scanf("%i", &macas);

if (macas >= 12){
    printf ("O valor total da compra eh: R$ %i,00\n", macas);
}else{
printf ("O valor total da compra eh: R$%f\n", macas * 1.30);
}
system("pause");
}
