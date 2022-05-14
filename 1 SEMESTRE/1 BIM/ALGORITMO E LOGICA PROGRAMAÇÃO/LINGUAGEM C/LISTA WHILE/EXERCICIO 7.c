#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main () {

int x;
float soma;
x = 1;
while (x <= 500){
if (x % 2 != 0 && x % 3 == 0){;
soma = soma + x;
}
x = x + 1;
};

printf ("A soma dos impares divisiveis por 3 eh %f\n", soma);
system ("pause");




}
