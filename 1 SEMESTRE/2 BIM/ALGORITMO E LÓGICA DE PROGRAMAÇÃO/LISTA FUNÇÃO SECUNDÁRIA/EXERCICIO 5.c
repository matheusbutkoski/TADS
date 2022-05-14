#include <stdio.h>
#include <stdlib.h>


int deci(int valor){

    int dec;

    dec = valor * 10;
    return dec;
  }
  int cent(int valor){

    int cen;

    cen = valor * 100;
    return cen;
  }

  int mili(int valor){

    int mil;

    mil = valor * 1000;
    return mil;
  }


int main(){

    int valor, dec=0, cen=0, mil=0;

    printf("Informe o valor em metros:\n");
    scanf("%i", &valor);

    dec = deci(valor);
    cen = cent(valor);
    mil = mili(valor);

    printf("O valor em decimetros eh: %i\n", dec);
    printf("O valor em centimetros eh: %i\n", cen);
    printf("O valor em milimetros eh: %i\n", mil);


}

