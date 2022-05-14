#include <stdlib.h>
#include <stdio.h>
#include <math.h>


int main (){

int x, contf = 0, contm;
char sexo;
float altura, somam, somaf = 0, mediam, mediaf;
x = 1;


while (x <= 10){

printf ("Digite os dados\n");
scanf ("%s", &sexo);

scanf ("%f", &altura);

if (sexo == 'F' || sexo == 'f'){
somaf = somaf + altura;
contf = contf + 1;
} else{
somam = somam + altura;
contm = contm + 1;
};
x = x + 1;
};
mediaf = somaf / contf;
mediam = somam / contm;
printf ("A media de altura dos homens eh %f\n", mediam);
printf ("A media de altura das mulheres eh %f\n", mediaf);
system ("pause");
}
