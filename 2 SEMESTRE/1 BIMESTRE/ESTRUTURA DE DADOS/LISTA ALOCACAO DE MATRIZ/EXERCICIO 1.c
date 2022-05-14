#include <stdio.h>
#include <stdlib.h>

int valor(int num, int l, int c, int **mat){
     int cont=0, i, j;

     for(i=0;i<l;i++){
        for(j=0;j<c;j++){
        if (num == mat[i][j]){
            cont++;
        }
        }
     }
     if (cont>=1){
         return 1;
     }else{
         return 0;
     }
}


int main(){
    int l, c, i, j, num, **mat, res=0;


    printf("Informe o numero de linhas da matriz\n");
    scanf("%i", &l);

     printf("Informe o numero de coluans da matriz\n");
    scanf("%i", &c);

    mat = (int**) malloc(l*sizeof(int*));
    for(i=0; i<l;i++){
        mat[i] = (int*)malloc(c*sizeof(int));

    }

    printf("Informe os valores da matriz\n");
    for(i=0;i<l;i++){
        for(j=0;j<c;j++){
            scanf("%i", &mat[i][j]);
        }
    }

    printf("Informe o valor que deseja procurar na matriz\n");
    scanf("%i", &num);
    res = valor(num, l, c, *&mat) ;

    if (res == 1){
        printf("Valor esta presente na matriz\n");
    }else{
        printf("Valor nao esta na matriz\n");
    }
    system("pause");


}
