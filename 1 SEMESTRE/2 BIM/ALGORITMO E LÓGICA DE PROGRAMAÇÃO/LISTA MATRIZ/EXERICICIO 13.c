#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main(){
int i,j, mat1[2][2], mat2[2][2], soma[2][2], sub[2][2], vet[4], cont=0;
char op;

srand(time(NULL));

for(i=0;i<2;i++){
   for(j=0;j<2;j++){
    mat1[i][j] = 1+rand()%100;
     mat2[i][j] = 1+rand()%100;
    }
}

printf("Informe o que deseja fazer com as matrizes\n");
printf(" A - Somar as duas matrizes\n B - Subtrair a primeira matriz da segunda\n C - Procurar itens iguais nas duas matrizes\n D - Imprimir as matrizes\n");
scanf("%s", &op);

if (op == 'A' || op == 'a'){
 for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        soma[i][j] = mat1[i][j] + mat2[i][j];
    }
}
for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        printf ("%i  ", mat1[i][j]);
   }
   printf ("\n");
}

printf("   + \n");

for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        printf ("%i  ", mat2[i][j]);
   }
   printf ("\n");
}

printf("   = \n");

for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        printf ("%i  ", soma[i][j]);
   }
   printf ("\n");
}
}

if (op == 'B' || op == 'b'){
         for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        sub[i][j] = mat1[i][j] - mat2[i][j];
    }
}
for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        printf ("%i  ", mat1[i][j]);
   }
   printf ("\n");
}

printf("   - \n");

for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        printf ("%i  ", mat2[i][j]);
   }
   printf ("\n");
}

printf("   = \n");

for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        printf ("%i  ", sub[i][j]);
   }
   printf ("\n");
}
}

if (op == 'C' || op == 'c'){
    for(i=0; i<2; i++){
       for(j=0; j<2; j++){
         if(mat1[i][j] == mat2[i][j]){

           vet[i] = mat1[i][j];
           cont = cont + 1;
       }
    }
}
for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        printf ("%i  ", mat1[i][j]);
   }
   printf ("\n");
}

printf("\n");

for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        printf ("%i  ", mat2[i][j]);
   }
   printf ("\n");
}

if (cont > 0){
      for(i=0; i<cont; i++){
printf("Os valores iguais nas duas matrizes sao: %i\n", vet[i]);
      }

}else{
printf ("Nao existem valores iguais entre as matrizes\n");
}
}

if (op == 'D' || op == 'd'){
    for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        printf ("%i  ", mat1[i][j]);
   }
   printf ("\n");
}

printf("\n");

for(i=0; i<2; i++){
   for(j=0; j<2; j++){
        printf ("%i  ", mat2[i][j]);
   }
   printf ("\n");
}
}






system("pause");
}


