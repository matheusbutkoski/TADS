#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main (){

int mat[3][3], i, j, contDP=0, contELE=0;

printf("Preencha a Matriz 3x3\n");



for(i=0;i<3;i++){
    for(j=0;j<3;j++){
        scanf("%i", &mat[i][j]);
    }
}
for(i=0;i<3;i++){
    for(j=0;j<3;j++){
        printf("%i  ", mat[i][j]);
    }
    printf("\n");
}

for(i=0;i<3;i++){
 if (mat[i][i] == 1){
    contDP++;
 }
   }

for(i=0;i<3;i++){
    for(j=0;j<3;j++){
       if(mat[i][j] == 0){
        contELE++;
       }
}
}



if(contDP == 3 && contELE == 6){
    printf("A matriz eh identidade\n");
}else{
    printf("A matriz nao eh identidade\n");
}

system("pause");
}
