#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
char numero[15];


printf  ("Informe o numero de celular\n");
gets (numero);



if(numero[0] == '4' && numero[1] == '5') {
    printf ("Cascavel\n");

}

if(numero[0] == '4' && numero[1] == '1') {
    printf ("Curitiba\n");

}

if(numero[0] == '2' && numero[1] == '1') {
    printf ("Rio de Janeiro\n");

}

if(numero[0] == '5' && numero[1] == '1') {
    printf ("Porto Alegre\n");

}

if(numero[0] == '6' && numero[1] == '7') {
    printf ("Mato Grosso do Sul\n");

}

if(numero[0] == '6' && numero[1] == '3') {
    printf ("Tocantins\n");

}







system("pause");
}
