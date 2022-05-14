#include<stdio.h>

int pot (int n, int p){
    if (p == 0){//potencia igual a zero retorna 1
        return 1;
    }else{
        return (n * pot(n,p-1));
    }
}

int main(){
    int n,p;
    printf("Digite um inteiro positivo:\n");
    scanf("%d",&n);
    printf("Digite a potencia:\n");
    scanf("%d",&p);
    printf("a resultado de %d elevado a %d eh %d\n", n,p,pot(n,p));
}
