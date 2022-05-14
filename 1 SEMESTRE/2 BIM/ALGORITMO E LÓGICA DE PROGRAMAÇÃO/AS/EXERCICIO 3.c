#include <stdio.h>
#include <stdlib.h>

int main(){

int i;
struct notas{

    char nome[30];
    int n1;
    int n2;
    float media;

}aluno[3];

for(i=0;i<3;i++){
    printf("Informe o nome do aluno:\n");
    fflush(stdin);
    gets(aluno[i].nome);
    fflush(stdin);

    printf("Informe a primeira nota:\n");
    scanf("%i", &aluno[i].n1);

    printf("Informe a segunda nota:\n");
    scanf("%i", &aluno[i].n2);

    aluno[i].media = (aluno[i].n1 + aluno[i].n2) / 2;
}
FILE *file;

file = fopen("binario.bin", "wb");
for(i=0;i<3;i++){

    fwrite(aluno[i].nome, sizeof(char),30,file);
    fwrite(aluno[i].n1, sizeof(int),1,file);
    fwrite(aluno[i].n2, sizeof(int),1,file);
    fwrite(&aluno[i].media, sizeof(float),1,file);
}

fclose(file);
system("pause");
}
