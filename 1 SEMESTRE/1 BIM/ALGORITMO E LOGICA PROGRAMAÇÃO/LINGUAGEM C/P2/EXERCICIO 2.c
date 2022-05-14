#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main () {
int ang1, ang2, ang3;

printf ("Informe o valor do primeiro angulo\n");
 scanf ("%i", &ang1);
printf ("Informe o valor do segundo angulo\n");
 scanf ("%i", &ang2);
printf ("Informe o valor do terceiro angulo\n");
 scanf ("%i", &ang3);

if (ang1 + ang2 + ang3 == 180){

 if (ang1 == 90 || ang2 == 90 || ang3 == 90){
   printf ("Triângulo Retangulo\n");
 }
 if (ang1 > 90 || ang2 > 90 || ang3 > 90){
   printf ("Triângulo Obtusangulo\n");
 }
 if (ang1 < 90 && ang2 < 90 && ang3 < 90){
   printf ("Triângulo Acutangulo\n");
}
}else {
printf ("A soma dos angulos nao eh igual a 180\n");
}
system ("pause");
}
