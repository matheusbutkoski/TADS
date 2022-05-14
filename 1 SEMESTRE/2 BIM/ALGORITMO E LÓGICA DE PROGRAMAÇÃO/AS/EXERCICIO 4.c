#include <stdio.h>
#include <stdlib.h>

int main(){
int i, mediaT;
struct notas{

    char nome[30];
    int n1;
    int n2;
    float media;

}aluno[3];

FILE *file;
file = fopen("binario.bin", "rb");

for(i=0;i<3;i++){

fread(aluno[i].nome, sizeof(aluno[i].nome),30,file);
fread(aluno[i].n1, sizeof(aluno[i].n1),1,file);
fread(aluno[i].n2, sizeof(aluno[i].n2),1,file);
fread(&aluno[i].media, sizeof(aluno[i].media),1,file);
mediaT = mediaT + aluno[i].media;
}
printf("Media da turma: %f\n", mediaT / 3);
printf("\n");
printf("Alunos Aprovados:\n");
for(i=0;i<3;i++){

if(aluno[i].media >= 7){
    printf("%s\n", aluno[i].nome);
}

}

fclose(file);
printf("\n");
system("pause");
}
