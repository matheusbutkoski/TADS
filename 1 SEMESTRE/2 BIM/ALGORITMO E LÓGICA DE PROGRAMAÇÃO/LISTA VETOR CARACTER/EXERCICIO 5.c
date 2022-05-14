#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main (){

char palavra[50];
int i, j, tam, cont=0;


printf ("Informe uma palavra\n");
gets(palavra);
fflush(stdin);

tam = strlen(palavra);
j = tam-1;

for(i = 0; i < tam; i++){
    if(palavra[i] == palavra[j]){
            cont++;
}
    j--;

}

if (cont == tam){

    printf ("A palavra eh palindromo\n");
}else{
    printf ("A palavra nao eh palindromo\n");
}

system("pause");
}
