#include <stdio.h>
#include <stdlib.h>

char opcoes(char op){

char tipo_pag;

    printf("A - A vista com 10 porcento de desconto\n");
    printf("B - Em duas vezes (preço da etiqueta)\n");
    printf("C - de 3 ate 10 vezes com 3 porcento de Juros ao mes (Compras acima de R$ 100,00)\n");
    scanf("%s", &tipo_pag);
    return tipo_pag;


}

float aVista(float valor){

printf("Valor total da compra: R$ %f\n", valor * 0.90);

}

float DuasVezes(float valor){

printf("Cada parcela vai custar: R$ %f\n", valor / 2);

}

float TrezADez(float valor){

float total, compra_juros, juro;
int parcelas;

juro = parcelas * 0.03;
compra_juros = valor + (valor * juro);
total = compra_juros/parcelas;

printf("O valor a ser pago em %i parcelas sera R$ %f\n\n", parcelas, total);
}



int main(){

float valor;
char op, tipo_pag;

printf("Informe o valor total da compra:\n");
scanf("%f", &valor);
printf("Opcoes de Pagamento:\n");
tipo_pag = opcoes(op);

if(tipo_pag == 'A' || tipo_pag == 'a'){
aVista(valor);

}
if(tipo_pag == 'B' || tipo_pag == 'b'){
DuasVezes(valor);

}
if(tipo_pag == 'C' || tipo_pag == 'c' && valor >= 100){
TrezADez(valor);
}else{
printf("Valor menor que R$ 100,00\n");
}


system("pause");
}
