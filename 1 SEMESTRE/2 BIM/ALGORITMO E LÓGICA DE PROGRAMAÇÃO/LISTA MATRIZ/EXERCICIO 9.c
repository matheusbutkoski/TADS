#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main (){


int mat[3][3], transposta[3][3], i, j;

srand(time(NULL));

for (i=0;i<3;i++){
    for(j=0;j<3;j++){
        mat[i][j] = 1+rand()%99;
    }
}

printf("Matriz Original:\n");
for (i=0;i<3;i++){
    for(j=0;j<3;j++){

printf("%i  ", mat[i][j]);

    }
    printf("\n");
}

for (i=0;i<3;i++){
    for(j=0;j<3;j++){
     transposta[j][i] = mat[i][j];
    }
}

printf("Matriz Transposta:\n");
for (i=0;i<3;i++){
    for(j=0;j<3;j++){

printf("%i  ", transposta[i][j]);

    }
    printf("\n");
}


system ("pause");
}
