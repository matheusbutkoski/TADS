#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
struct aluno{
int cod_matri,nota1,nota2,nota3;
char nome[50];

}alu[5];
int maior=0,media,maiorMedia,menorMedia;
for(int i = 0; i < 5; i++){
    fflush(stdin);
    printf("Informe o nome\n");
    gets(alu[i].nome);
    printf("Informe a matricula\n");
    scanf("%d",&alu[i].cod_matri);
    printf("Informe a nota da primeira prova\n");
    scanf("%d",&alu[i].nota1);
    printf("Informe a nota da segunda prova\n");
    scanf("%d",&alu[i].nota2);
    printf("Informe a nota da terceira prova\n");
    scanf("%d",&alu[i].nota3);
    if(alu[i].nota1 > maior){
        maior = alu[i].nota1;
    }
    media = (alu[i].nota1 + alu[i].nota2 + alu[i].nota3)/3;
    if(media > maiorMedia){
        mamedia = media;
    }
    if(media < menorMedia){
        memedia = media;
    }


}
    for(int i = 0; i < 5; i++){
    printf("Nome: %s\n",alu[i].nome);
    if(media >= 6){
        printf("Aprovado\n");
    }else{
        printf("Reprovado\n");
    }

}
printf("A maior nota na primeira prova foi: %d\n",maior);
printf("A maior media foi: %d\n",mamedia);
printf("A maior media foi: %d\n",memedia);


system("Pause");
return 0;
}

