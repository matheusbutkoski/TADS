#include <stdio.h>
#include <stdlib.h>

int main(){

int s, i,*x;

printf("Informe o tamanho da string: \n");
scanf("%i", &s);

char string[s];

x = (char *) malloc(s * sizeof(char));

printf("Informe a string: \n");

scanf("%s", &string);


for(i=0;i<s;i++){

    x[i] = string[i];
    if(x[i] != 'A' && x[i] != 'a' && x[i] != 'E' && x[i] != 'e' && x[i] != 'I' && x[i] != 'i' && x[i] != 'O' && x[i] != 'o' && x[i] != 'U' && x[i] != 'u'){

    printf("%c", string[i]);
    }
}
free(x);
printf("\n");

system("pause");
}


printf("Informe quantos valores deseja empilhar\n");
        scanf("%i", &x);

         x = (int*) realloc(val,x*sizeof(int));
