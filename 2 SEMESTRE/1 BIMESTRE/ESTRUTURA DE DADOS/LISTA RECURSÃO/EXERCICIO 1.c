#include<stdio.h>

int soma  (int n){
    if (n == 1){
        return 1;
    }else{
        return (n + soma(n-1));
    }
}

int main(){
    int n;
    printf("Digite um inteiro positivo:\n");
    scanf("%d",&n);
    printf("a soma dos numero de 1 ate %d = %d\n", n,soma(n));
}
