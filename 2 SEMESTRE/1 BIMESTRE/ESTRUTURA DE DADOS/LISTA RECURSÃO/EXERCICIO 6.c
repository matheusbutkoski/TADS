#include <stdio.h>

int soma (int num){
    int a,b;
    a =  num % 10;
    b = (num - a)/10;
    if(b <= 0){
        return a;
    }else{
        return a + soma(b);
    }

}

int main(){
    int num;
    printf("Informe um numero para ver a soma de seus digitos\n");
    scanf("%d", &num);
    printf("A soma dos digitos de numero eh %d\n", soma(num));
}
