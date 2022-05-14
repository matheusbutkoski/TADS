#include <stdio.h>
#include <stdlib.h>


float aritmetica (float n1, float n2 , float n3){
float ari;

ari = (n1 + n2 + n3)/3;


return ari;
}

float ponderada (float n1, float n2 , float n3){
float pond;

pond = (n1 * 5 + n2 * 3 + n3 * 2) / 10;

return pond;
}




int main(){

 float  n1, n2, n3, ari, pond;
 char letra;

printf ("Informe a primeira nota\n");
scanf ("%f", &n1);

printf ("Informe a segunda nota\n");
scanf ("%f", &n2);

printf ("Informe a terceira nota\n");
scanf ("%f", &n3);

printf ("Informe uma letra\n");
scanf ("%s", &letra);

ari = aritmetica(n1, n2, n3);
pond = ponderada(n1, n2, n3);

if(letra == 'A' || letra == 'a'){
printf ("A media aritimetica eh: %f\n", ari);

}if(letra == 'P' || letra == 'p'){
printf ("A media ponderada eh: %f\n", pond);
}

system("pause");


}
