#include<stdio.h>

int mult (int n1, int n2){
    if (n2 == 0) {
        return 0;
    }else{
        return n1 + mult(n1, n2-1);
    }
}

int main(){
    int n1,n2;
    printf("Informe primeiro numero\n");
    scanf("%d",&n1);
    printf("Informe seu multiplicador\n");
    scanf("%d",&n2);
    printf("o resultado da multiplicada atraves da soma eh %d\n", mult(n1,n2));
}
