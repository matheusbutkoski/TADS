#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){
int idade, peso;
idade = 0;
peso = 0;

printf ("Digite sua idade\n");
scanf ("%i", &idade);

if (idade >= 18 && idade <= 67){
printf ("Digite seu peso\n");
scanf ("%i", &peso);
};
if (peso > 50){
    printf ("Voce pode doar sangue\n");

} else {
printf("Voce nao pode doar sangue\n");

};
system ("pause");
}
