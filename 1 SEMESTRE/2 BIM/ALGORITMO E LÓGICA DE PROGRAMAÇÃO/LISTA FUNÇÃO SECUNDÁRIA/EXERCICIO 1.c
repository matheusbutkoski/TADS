#include <stdio.h>
#include <stdlib.h>
#include <math.h>



int calc (int v){
    if(v > 0){
       printf("Positivo\n");


    }else if (v < 0){
       printf ("Negativo\n");

    }else{
       printf ("Igual a 0\n");
    }


}


int parimp (int v){
    if (v % 2 == 0){
        printf ("Par\n");
    }else{
        printf ("Impar\n");
    }
}

int main (){
    int valor;
    printf("Informe o valor\n");
    scanf("%i", &valor);
    calc (valor);
    parimp (valor);







system("pause");
}
